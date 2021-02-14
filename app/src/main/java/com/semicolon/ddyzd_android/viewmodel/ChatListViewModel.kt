package com.semicolon.ddyzd_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.fragment.ClubList
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChatListViewModel(val token : LoginViewModel, val navigetor : MainActivity) : ViewModel(){
    val list = ChatList().findViewById<RecyclerView>(R.id.chatRecyclerView)
    val apiAdapter  = BaseApi.getInstance()

    var clubImage = mutableListOf<Int>() // 동아리 이미지
    var clubName = mutableListOf<String>() // 동아리 이름
    var lastMessage = mutableListOf<String>() // 마지막 글
    var lastDate = mutableListOf<String>() // 마지막 글 시간
    var roomId = mutableListOf<String>()
    var clubId = mutableListOf<String>()

    var size : Int = 0
    var chatList = mutableListOf<ChatListData>()
    val accessToken = token.accessToken
    val refreshToken = token.refreshToken

    lateinit var chatListBody : ArrayList<ChatListData>

    val callInfo = apiAdapter.chatList(refreshToken)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
            chatListBody = result

        }

    fun inputList(chatListBody : ArrayList<ChatListData>){
        size = chatListBody.size
        for (i in 0 until size){
            clubImage.add(chatListBody[i].clubImage)
            clubName.add(chatListBody[i].clubName)
            lastMessage.add(chatListBody[i].lastMessage)
            lastDate.add(chatListBody[i].lastDate)
            roomId.add(chatListBody[i].roomid)
            clubId.add(chatListBody[i].clubid)

            chatList.add(
                ChatListData(
                    roomid = roomId[i], clubid = clubId[i], clubName = clubName[i], clubImage = clubImage[i]  ,
                    lastDate = lastDate[i], lastMessage = lastMessage[i])
            )
            list?.setHasFixedSize(true)
            list?.layoutManager = LinearLayoutManager(
                ChatList().application,
                LinearLayoutManager.VERTICAL,
                false
            )
            list?.adapter = ChatListAdapter(chatList as ArrayList<ChatListData>,navigator = navigetor)
        }
    }

}