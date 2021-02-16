package com.semicolon.ddyzd_android.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.reflect.cast

class MainFeedViewModel(private val navigator: MainActivity) : ViewModel() {
    var readFeed = ArrayList<MainFeedData>()
    val feeds = MutableLiveData<List<MainFeedData>>()
    val feedAdapter = MainFeedAdapter(feeds, this)
    val callApi = MutableLiveData<Int>(0)
    val adapter = BaseApi.getInstance()

    val scrollListener=object:RecyclerView.OnScrollListener(){
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            val manager=LinearLayoutManager::class.cast(recyclerView.layoutManager)
            val totalItem= manager.itemCount
            val lastVisible=manager.findLastCompletelyVisibleItemPosition()
            if(lastVisible>=totalItem-1){
                readFeeds()
            }
        }
    }

    fun onCreate() {
        readFeed.clear()
        readFeeds()
        feedAdapter.notifyDataSetChanged()
    }

    fun flagClicked(id: String, position: Int) {
        adapter.flagClicked(id, "Bearer ${navigator.accessToken}")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
            .doOnSuccess {
                feeds.value?.get(position)?.flag = !feeds.value?.get(position)?.flag!!
                var flag = feeds.value?.get(position)?.flags?.toInt()!!
                flag += 1
                feeds.value?.get(position)?.flags = flag.toString()
            }
            .doOnError {
                it->startLogin()
            }.subscribe()
    }

    private fun startLogin() {
        navigator.showToast("로그인이 필요합니다")
        navigator.startLogin()
    }

    fun readFeeds() {
        adapter.readFeed(callApi.value.toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
            .doOnError {
                println("error")
            }
            .doOnSuccess { result ->
                readFeed.addAll(result)
                feeds.value = readFeed
                feedAdapter.notifyDataSetChanged()
                callApi.value = callApi.value?.plus(1)
                Log.d("불러옴",result.toString())
            }.subscribe()
    }

    fun onChattingClicked() {
        navigator.startChatting()
    }

}