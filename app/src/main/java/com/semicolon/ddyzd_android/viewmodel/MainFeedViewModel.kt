package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainFeedViewModel(private val navigator: MainActivity) : ViewModel() {
    var readFeed = ArrayList<MainFeedData>()
    val feeds = MutableLiveData<List<MainFeedData>>()
    val feedAdapter = MainFeedAdapter(feeds, this)
    var callApi = 0
    val adapter = BaseApi.getInstance()
    val isEmpty = MutableLiveData<Int>(View.INVISIBLE)
    lateinit var scrollListener: RecyclerView.OnScrollListener

    val progressVisible=MutableLiveData<Int>(View.INVISIBLE)
    fun onCreate() {
        progressVisible.value=View.VISIBLE
        ActivityNavigator.mainFeedViewModel=this
        callApi = 0
        readFeed.clear()
        feeds.value=readFeed
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
                    feedAdapter.notifyDataSetChanged()
                } else {
                    startLogin()
                }
            }, {
            })
    }

    private fun startLogin() {
        navigator.showToast("로그인이 필요합니다")
        navigator.startLogin()
    }

    @SuppressLint("CheckResult")
    private fun readFeeds() {
        adapter.readFeed("Bearer ${accessToken.value}", callApi.toString(),System.currentTimeMillis().toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    isEmpty.value = View.INVISIBLE
                    response.body()?.let { readFeed.addAll(it) }
                    feeds.value = readFeed
                    feedAdapter.notifyDataSetChanged()
                    callApi += 1
                } else {
                    isEmpty.value = View.VISIBLE
                }
                progressVisible.value=View.INVISIBLE
            }, {
                isEmpty.value = View.VISIBLE
                navigator.showToast("인터넷 문제가 발생하였습니다")
                progressVisible.value=View.INVISIBLE
            })
    }

    fun onMoreClicked(owner:Boolean,id:String){
        if(owner){
            navigator.showMore(id.toInt())
        }else{
            navigator.notShowMore()
        }
    }

    fun onChattingClicked() {
        navigator.startChatting()
    }

    @SuppressLint("CheckResult")
    fun deleteFeed(id:Int){
        if(navigator.closeSheet()){
            adapter.deleteFeed("Bearer ${accessToken.value}",id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if(it.isSuccessful){
                        navigator.showToast("피드삭제가 완료되었습니다")
                        navigator.reLoadFeeds()
                    }else{
                        navigator.showToast("피드삭제를 실패하였습니다")
                    }
                },{
                    navigator.showToast("피드삭제를 실패하였습니다")
                })
        }
    }

}