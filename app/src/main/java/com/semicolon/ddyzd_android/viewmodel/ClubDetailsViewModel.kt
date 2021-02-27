package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.text.Html
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ClubDetailAdapter
import com.semicolon.ddyzd_android.adapter.ClubMemberAdapter
import com.semicolon.ddyzd_android.model.*
import com.semicolon.ddyzd_android.ul.activity.ClubDetails
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

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

    val chatBtnText=MutableLiveData<CharSequence>("채팅보내기")

    lateinit var scrollListener: RecyclerView.OnScrollListener
    val adapter = BaseApi.getInstance()

    fun onCreate() {
        ActivityNavigator.clubDetailViewModel=this
        callApi = 0
        readFeeds.clear()
        readMembers.clear()
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
        if (!accessToken.value.isNullOrEmpty()) {
            token = "Bearer ${accessToken.value}"
        }
        adapter.readClubInfo(token, club.toInt(), time)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                clubDetail.value = it.body()
                if(clubDetail.value!=null){
                    if(clubDetail.value!!.recruitment){
                        calculateDate(clubDetail.value!!.recruitment_close)
                    }
                }
                detailAdapter.notifyDataSetChanged()
            }, {
                navigator.showToast("인터넷 연결을 확인해주세요")
            })
    }

    @SuppressLint("CheckResult")
    private fun readMembers() {
        adapter.clubMember("Bearer ${accessToken.value}", club)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
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
        adapter.readClubFeeds("Bearer ${accessToken.value}", club, callApi,System.currentTimeMillis().toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ it ->
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
        adapter.flagClicked("Bearer ${accessToken.value}", id)
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
                    feeds.value?.get(position)?.flags = flag
                    detailAdapter.notifyDataSetChanged()
                } else {
                    startLogin()
                }
            }, {
            })
    }

    private fun startLogin() {
        navigator.startLogin()
    }

    fun finish() {
        navigator.finish()
    }

    @SuppressLint("CheckResult")
    fun startChatting() {
        adapter.makeChatRoom("Bearer ${accessToken.value}",club)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    navigator.startChatting(it.body()!!.roomId)
                }else{
                    navigator.startLogin()
                }
            },{
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })

    }

    @SuppressLint("CheckResult")
    fun startFollow() {
        adapter.doFollow("Bearer ${accessToken.value}", club)
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

    @SuppressLint("CheckResult")
    fun unFollow(){
        adapter.unFollow("Bearer ${accessToken.value}",club)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    clubDetail.value!!.follow = false
                    detailAdapter.notifyDataSetChanged()
                }else {
                    navigator.startLogin()
                }

            },{
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })
    }

    fun onMoreClicked(owner:Boolean,id:String){
        if(owner){
            navigator.showMore(id.toInt())
        }else{
            navigator.notShowMore()
        }
    }

    @SuppressLint("CheckResult")
    fun deleteFeed(id:Int){
        navigator.closeSheet()
        adapter.deleteFeed("Bearer ${accessToken.value}",id)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    navigator.showToast("피드삭제가 완료되었습니다")
                    onCreate()
                }else{
                    navigator.showToast("피드삭제를 실패하였습니다")
                }
            },{
                navigator.showToast("피드삭제를 실패하였습니다")
            })
    }

    private fun calculateDate(day:Date) {
        val dateFormat= SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz", Locale.KOREA)
        val currentDateTime= System.currentTimeMillis()
        val date= Date(currentDateTime)
        val currentTime=dateFormat.format(date)
        val getTime=dateFormat.format(day)
        val longCurrentTime=dateFormat.parse(currentTime).time
        val longGetTime=dateFormat.parse(getTime).time
        val diff=(longGetTime-longCurrentTime)/1000
        val dayDiff=(diff/86400)
        if(dayDiff>0){
            val text="<font color=#ff0000>D-${dayDiff}</font> <font color=#000000>지원하기</font>"
            val string=Html.fromHtml(text)
            chatBtnText.value=string
        }else{
            chatBtnText.value="D-DAY"
        }
    }

    fun gotoUserInfo(userGcn:String){
        navigator.showUserInfo(userGcn)
    }
}