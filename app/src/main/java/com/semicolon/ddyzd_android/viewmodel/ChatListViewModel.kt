package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken

import com.semicolon.dsm_sdk_v1.DsmSdk.Companion.instance
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException

class ChatListViewModel(navigater: ChatList) : ViewModel() {
    val list: RecyclerView = navigater.findViewById(R.id.chatRecyclerView)
    private val apiAdapter = BaseApi.getInstance()

    var clubImage = mutableListOf<Int>() // 동아리 이미지
    var clubName = mutableListOf<String>() // 동아리 이름
    var lastMessage = mutableListOf<String>() // 마지막 글
    var lastDate = mutableListOf<String>() // 마지막 글 시간
    var roomId = mutableListOf<String>()
    var clubId = mutableListOf<String>()
    val CODE = 1
    var size: Int = 0
    var chatList = mutableListOf<ChatListData>()
    //val a = println("${accessToken},${refreshToken}")
    lateinit var chatListBody: ArrayList<ChatListData>
    init{
        callChatList(navigater)
    }

    @SuppressLint("CheckResult")
    fun callChatList(navigater: ChatList) {
        println("$accessToken ㄱㅁㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅁㅁㄴㅇㅁ")
        apiAdapter.chatList("Bearer $accessToken")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { response ->
                    if (response.isSuccessful) {
                        println("이거가 되네")
                        response.body()?.let { inputList(it) }
                    } else {
                        navigater.startLogin()
                        println("${accessToken} 이거를 확인해야되!!!")
                        println("${response.message()} hj")
                        navigater.finish()
                    }
                }, { throwable ->
                    println("이거${throwable.message}")
                }
            )
    }


    fun inputList(chatListBody: ArrayList<ChatListData>) {
        size = chatListBody.size
        for (i in 0 until size) {
            clubImage.add(chatListBody[i].clubImage)
            clubName.add(chatListBody[i].clubName)
            lastMessage.add(chatListBody[i].lastMessage)
            lastDate.add(chatListBody[i].lastdata)
            roomId.add(chatListBody[i].roomid)
            clubId.add(chatListBody[i].clubid)

            chatList.add(
                ChatListData(
                    roomid = roomId[i],
                    clubid = clubId[i],
                    clubName = clubName[i],
                    clubImage = clubImage[i],
                    lastdata = lastDate[i],
                    lastMessage = lastMessage[i]
                )
            )
            list?.setHasFixedSize(true)
            list?.layoutManager =
                LinearLayoutManager(ChatList().application, LinearLayoutManager.VERTICAL, false)
            list?.adapter =
                ChatListAdapter(chatList as ArrayList<ChatListData>, navigator = MainActivity())
        }
    }

}