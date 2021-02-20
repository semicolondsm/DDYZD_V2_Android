package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.net.Socket
import java.net.URISyntaxException

class ChatListViewModel(val navigater: ChatList) : ViewModel() {
    private val apiAdapter = BaseApi.getInstance()
    private var readChatList = mutableListOf<ChatListData>()
    val list = MutableLiveData<List<ChatListData>>()
    val clubListAdapter = ChatListAdapter(list,this)
    init{
        callChatList(navigater)
    }
    fun onCreate(){
        /*try {
            socket = IO.socket("https://api.eungyeol.live/chat")
            socket.connect()
            socket.on(Socket.EVENT_CONNECT){
                println("성공")
            }.on(Socket.EVENT_CONNECT_ERROR){
                println("실패;;")
            }
        }catch (e : URISyntaxException){
            println(e.reason)
        }*/
    }


    @SuppressLint("CheckResult")
    fun callChatList(navigater: ChatList) {
        apiAdapter.chatList("Bearer $accessToken")
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
                        navigater.finish()
                    }
                }, { throwable ->
                    println("${throwable.message}")
                }
            )
    }
    fun goChatting(data : ChatListData){
        navigater.startChating(data)
    }
}
