package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.adapter.ChattingAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ChattingData
import com.semicolon.ddyzd_android.ul.activity.ChattingPage
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChattingPageViewModel(val navigater : ChattingPage) : ViewModel() {




    val chattingList = MutableLiveData<List<ChattingData>>()
    val roomid = navigater.roomId
    val clubImage = navigater.clubImage
    val clubName = navigater.clubName
    val adapter = BaseApi.getInstance()
    private var readChattingList = mutableListOf<ChattingData>()
    val chattingListAdapter = ChattingAdapter(chattingList, this)

    val a = getChatting()
    @SuppressLint("CheckResult")
    private fun getChatting() {
        adapter.getChatting("Bearer ${accessToken.value}", roomid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    response.body()?.let { readChattingList.addAll(it) }
                    chattingList.value = readChattingList
                    chattingListAdapter.notifyDataSetChanged()
                }
            }, {
            })
    }


}