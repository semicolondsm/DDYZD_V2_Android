package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainFeedViewModel(private val navigator: MainActivity) : ViewModel() {
    var readFeed = ArrayList<MainFeedData>()
    val feeds = MutableLiveData<List<MainFeedData>>()
    val feedAdapter = MainFeedAdapter(feeds, this)
    var callApi = 0
    val adapter = BaseApi.getInstance()
    val isEmpty=MutableLiveData<Int>(View.INVISIBLE)

    val scrollListener = object : RecyclerView.OnScrollListener() {
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


    fun onCreate() {
        callApi = 0
        readFeed.clear()
        feedAdapter.notifyDataSetChanged()
    }

    @SuppressLint("CheckResult")
    fun flagClicked(id: String, position: Int) {
        Log.d("클릭", "id:$id")
        adapter.flagClicked("Bearer $accessToken",id)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    feeds.value?.get(position)?.flag = !feeds.value?.get(position)?.flag!!
                    var flag = feeds.value?.get(position)?.flags!!.toInt()
                    if(feeds.value?.get(position)?.flag!!){
                        flag += 1
                    }else{
                        flag-=1
                    }
                    feeds.value?.get(position)?.flags = flag.toString()
                    feedAdapter.notifyDataSetChanged()
                } else {
                    Log.e("token",response.raw().toString())
                    startLogin()
                }
            },{throwable->
                Log.w("api","${throwable.message}")
            })
    }

    private fun startLogin() {
        navigator.showToast("로그인이 필요합니다")
        navigator.startLogin()
    }

    @SuppressLint("CheckResult")
    fun readFeeds() {
        adapter.readFeed("Bearer $accessToken",callApi.toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({response->
                if(response.isSuccessful){
                    isEmpty.value=View.INVISIBLE
                    response.body()?.let { readFeed.addAll(it) }
                    feeds.value = readFeed
                    feedAdapter.notifyDataSetChanged()
                    callApi += 1
                }else{
                    isEmpty.value=View.VISIBLE
                }
            },{
            isEmpty.value=View.VISIBLE
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })
    }

    fun onChattingClicked() {
        navigator.startChatting()
    }

}