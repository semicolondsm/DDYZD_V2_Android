package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.ApiService
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

import io.socket.client.IO
import io.socket.client.Manager
import io.socket.client.Socket
import org.json.JSONObject


import java.net.URISyntaxException

class ChatListViewModel(val navigater: ChatList) : ViewModel() {
    private val apiAdapter = BaseApi.getInstance()
    private var readChatList = mutableListOf<ChatListData>()
    val list = MutableLiveData<List<ChatListData>>()
    val clubListAdapter = ChatListAdapter(list,this)
    val value = listOf<String>()
    val map  = mutableListOf("${accessToken.value}")

    private lateinit var socket : Socket

    init{
        callChatList(navigater)
    }
    val userId = JSONObject()

    val ops =IO.Options()

    fun onCreate() {
        callChatList(navigater)

        val value = mutableListOf<String>("Bearer${accessToken.value}")
            try {

                socket = IO.socket("http://api.eungyeol.live/chat",ops)
                ops.extraHeaders = mapOf("Authorization" to  value)
                socket.connect()

                socket.on(Socket.EVENT_CONNECT) {
                    println("성공")
                }.on(Socket.EVENT_CONNECT_ERROR) {
                    println("실패;;")
                    println(it.contentToString())
                }
            } catch (e: URISyntaxException) {
                println(e.reason)
            }

    }


    @SuppressLint("CheckResult")
    fun callChatList(navigater: ChatList) {
        apiAdapter.chatList("Bearer ${accessToken.value}")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                    response ->
                    if (response.isSuccessful) {
                        response.body()?.let { readChatList.addAll(it) }
                        list.value = readChatList
                        clubListAdapter.notifyDataSetChanged()
                    } else {
                        navigater.startLogin()
                    }
                },{ throwable ->
                    println("${throwable.message}")
                }
            )
    }
    fun goChatting(data : ChatListData){
        navigater.startChating(data)
    }
}
