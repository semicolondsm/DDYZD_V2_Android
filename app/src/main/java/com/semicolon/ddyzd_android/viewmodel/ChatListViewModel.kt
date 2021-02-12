package com.semicolon.ddyzd_android.viewmodel

import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.dsm_sdk_v1.DsmSdk
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChatListViewModel(val token : LoginViewModel) : ViewModel(){

    val adapter  = BaseApi.getInstance()

    val accessToken = token.accessToken
    val refreshToken = token.refreshToken

    lateinit var chatListBody : ArrayList<ChatListData>

    val callInfo = adapter.chatList(refreshToken)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
            chatListBody = result
        }


}