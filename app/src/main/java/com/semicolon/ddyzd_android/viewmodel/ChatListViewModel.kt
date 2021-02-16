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
import com.semicolon.dsm_sdk_v1.DsmSdk.Companion.instance
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException

class ChatListViewModel(navigater : ChatList) : ViewModel(){
    val list: RecyclerView = navigater.findViewById(R.id.chatRecyclerView)
    private val apiAdapter  = BaseApi.getInstance()

    var clubImage = mutableListOf<Int>() // 동아리 이미지
    var clubName = mutableListOf<String>() // 동아리 이름
    var lastMessage = mutableListOf<String>() // 마지막 글
    var lastDate = mutableListOf<String>() // 마지막 글 시간
    var roomId = mutableListOf<String>()
    var clubId = mutableListOf<String>()
    val CODE = 1

    var size : Int = 0
    var chatList = mutableListOf<ChatListData>()
    val accessToken = navigater.accessToken
    val refreshToken = navigater.refreshToken

    //val a = println("${accessToken},${refreshToken}")

    lateinit var chatListBody : ArrayList<ChatListData>

    /*val a = println(refreshToken)
    val callInfo = apiAdapter.chatList(refreshToken)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            val ERROR_MESSAGE = it.message
            println("$ERROR_MESSAGE")
            if(ERROR_MESSAGE?.contains("401") == true){

            }
            println("error")

        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
            chatListBody = result
            //inputList(chatListBody)


        }*/
    val a = callChatList(navigater,accessToken)

     @SuppressLint("CheckResult")
     fun callChatList(navigater: ChatList, accessToken : String){
         val time =System.currentTimeMillis()
         println(time)
        apiAdapter.chatList(time,"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjF9.q0xFOcoDPBJlX-mO0WkxqKUFLUmr9v_JG_oJqiS95ss")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {response ->
                    if(response.isSuccessful){
                        println("가나다")
                    }
                    else{
                        navigater.inentLoginActivity(CODE)
                        println("${response.message()} hj")
                    }
                },{throwable->
                    println("${throwable.message}")
                }
            )
    }


    fun inputList(chatListBody : ArrayList<ChatListData>){
        size = chatListBody.size
        for (i in 0 until size){
            clubImage.add(chatListBody[i].clubImage)
            clubName.add(chatListBody[i].clubName)
            lastMessage.add(chatListBody[i].lastMessage)
            //lastDate.add(chatListBody[i].lastDate)
            roomId.add(chatListBody[i].roomid)
            clubId.add(chatListBody[i].clubid)

            chatList.add(
                ChatListData(
                    roomid = roomId[i], clubid = clubId[i], clubName = clubName[i], clubImage = clubImage[i]  , lastdata = lastDate[i],
                    lastMessage = lastMessage[i])
            )
            list?.setHasFixedSize(true)
            list?.layoutManager = LinearLayoutManager(ChatList().application, LinearLayoutManager.VERTICAL, false)
            list?.adapter = ChatListAdapter(chatList as ArrayList<ChatListData>,navigator = MainActivity())
        }
    }

}