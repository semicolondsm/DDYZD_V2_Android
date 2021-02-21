package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ClubDetailAdapter
import com.semicolon.ddyzd_android.adapter.ClubMemberAdapter
import com.semicolon.ddyzd_android.model.*
import com.semicolon.ddyzd_android.ul.activity.ClubDetails
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ClubDetailsViewModel(val club: String, val navigator: ClubDetails) : ViewModel() {
    val clubDetail = MutableLiveData<ClubInDetailData>()
    private val readMembers = ArrayList<MembersData>()
    val readFeeds = ArrayList<MainFeedData>()
    val feeds = MutableLiveData<List<MainFeedData>>()
    val members = MutableLiveData<List<MembersData>>()
    val memberAdapter: ClubMemberAdapter = ClubMemberAdapter(members, this)
    val detailAdapter = ClubDetailAdapter(feeds, this)
    var callApi = 0
    val isEmpty = MutableLiveData<Int>(View.INVISIBLE)
    var time = ""
    val visible = View.VISIBLE
    val invisible = View.INVISIBLE

    lateinit var scrollListener: RecyclerView.OnScrollListener
    val adapter = BaseApi.getInstance()

    fun onCreate() {
        callApi = 0
        readFeeds.clear()
        scrollListener = object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val manager = (recyclerView.layoutManager) as LinearLayoutManager
                val totalItem = manager.itemCount
                val lastVisible = manager.findLastCompletelyVisibleItemPosition()
                if (lastVisible >= totalItem - 1) {
                    readFeeds()
                }
            }
        }
        readTime()
        readClubInfo()
        readMembers()
    }

    private fun readTime() {
        time = System.currentTimeMillis().toString()
    }

    @SuppressLint("CheckResult")
    private fun readClubInfo() {
        var token: String? = null
        if (accessToken.isNotEmpty()) {
            token = "Bearer $accessToken"
        }
        adapter.readClubInfo(token, club.toInt(), time)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                clubDetail.value = it.body()
                detailAdapter.notifyDataSetChanged()
            }, {
                navigator.showToast("인터넷 연결을 확인해주세요")
            })
    }

    @SuppressLint("CheckResult")
    private fun readMembers() {
        adapter.clubMember("Bearer $accessToken", club)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                Log.d("동아리원", it.raw().toString())
                if (it.isSuccessful) {
                    isEmpty.value = View.INVISIBLE
                    it.body()?.let { it1 -> readMembers.addAll(it1) }
                    members.value = readMembers
                }
                memberAdapter.notifyDataSetChanged()
                detailAdapter.notifyDataSetChanged()
            }, {
                memberAdapter.notifyDataSetChanged()
                detailAdapter.notifyDataSetChanged()
            })
    }

    @SuppressLint("CheckResult")
    private fun readFeeds() {
        adapter.readClubFeeds("Bearer $accessToken", club, callApi,System.currentTimeMillis().toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ it ->
                Log.d("동아리피드", it.raw().toString())
                Log.d("동아리피드","토큰 $accessToken")
                if (it.isSuccessful) {

                    isEmpty.value = View.INVISIBLE
                    it.body()?.let { readFeeds.addAll(it) }
                    feeds.value = readFeeds
                    detailAdapter.notifyDataSetChanged()
                    if ((feeds.value as ArrayList<MainFeedData>).size == 0) {
                        isEmpty.value = View.VISIBLE
                    } else {
                        isEmpty.value = View.INVISIBLE
                    }
                    callApi += 1
                } else {
                    isEmpty.value = View.VISIBLE
                }
            }, {
                isEmpty.value = View.VISIBLE
            })
    }

    @SuppressLint("CheckResult")
    fun flagClicked(id: String, position: Int) {
        adapter.flagClicked("Bearer $accessToken", id)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    feeds.value?.get(position)?.flag = !feeds.value?.get(position)?.flag!!
                    var flag = feeds.value?.get(position)?.flags!!.toInt()
                    if (feeds.value?.get(position)?.flag!!) {
                        flag += 1
                    } else {
                        flag -= 1
                    }
                    feeds.value?.get(position)?.flags = flag.toString()
                    detailAdapter.notifyDataSetChanged()
                } else {
                    Log.e("token", response.raw().toString())
                    startLogin()
                }
            }, { throwable ->
                Log.w("api", "${throwable.message}")
            })
    }

    private fun startLogin() {
        navigator.startLogin()
    }

    fun finish() {
        navigator.finish()
    }

    fun startChatting() {
        navigator.startChatting()
    }

    @SuppressLint("CheckResult")
    fun startFollow() {
        adapter.doFollow("Bearer $accessToken", club)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    clubDetail.value!!.follow = true
                    detailAdapter.notifyDataSetChanged()
                } else {
                    navigator.startLogin()
                }
            }, {
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })
    }
}


