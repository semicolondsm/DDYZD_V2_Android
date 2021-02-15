package com.semicolon.ddyzd_android .viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainFeedViewModel(private val navigator: MainActivity) : ViewModel() {
    var readFeed = ArrayList<MainFeedData>()
    val feeds = MutableLiveData<List<MainFeedData>>()
    val feedAdapter = MainFeedAdapter(feeds, this)
    val callApi = MutableLiveData<Int>(0)
    val adapter = BaseApi.getInstance()

    fun onCreate() {
        readFeed.clear()
        readFeeds()
        feedAdapter.notifyDataSetChanged()
    }

    fun flagClicked(id:String,position:Int){
        Log.d("플래그",id)
        adapter.flagClicked(id,"Bearer ${navigator.accessToken}").observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnError {
                Log.d("플래그",it.message!!)
                navigator.startLogin()
            }
            .unsubscribeOn(Schedulers.io())
            .subscribe{result->
                feeds.value?.get(position)?.flag =true
                feeds.value?.get(position)?.flags+=1
            }
    }

    fun readFeeds() {
        adapter.readFeed(callApi.value.toString()).observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnError {
                println("error")
            }
            .unsubscribeOn(Schedulers.io())
            .subscribe{ result ->
                Log.d("피드",result.toString())
                readFeed.addAll(result)
                feeds.value = readFeed
                feedAdapter.notifyDataSetChanged()
            }
    }

    fun onChattingClicked() {
        navigator.startChatting()
    }
}