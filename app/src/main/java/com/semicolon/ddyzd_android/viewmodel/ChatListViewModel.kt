package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ClubListData
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken

import com.semicolon.dsm_sdk_v1.DsmSdk.Companion.instance
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException

class ChatListViewModel(navigater: ChatList) : ViewModel() {
    private val apiAdapter = BaseApi.getInstance()
    private var readChatList = mutableListOf<ChatListData>()
    val list = MutableLiveData<List<ChatListData>>()
    val clubListAdapter = ChatListAdapter(list,this)

    var clubImage = mutableListOf<String>() // 동아리 이미지
    var clubName = mutableListOf<String>() // 동아리 이름
    var lastMessage = mutableListOf<String>() // 마지막 글
    var lastDate = mutableListOf<String>() // 마지막 글 시간
    var roomId = mutableListOf<String>()
    var clubId = mutableListOf<String>()
    var size: Int = 0
    var chatList = mutableListOf<ChatListData>()

    lateinit var chatListBody: ArrayList<ChatListData>
    init{
        callChatList(navigater)
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
    fun goChatting(position : Int,navigater: ChatList){
        val clubId =list.value?.get(position)?.clubid
        val clubImage = list.value?.get(position)?.clubimage
        val clubName = list.value?.get(position)?.clubname
        val lastMessage = list.value?.get(position)?.lastmessage
        val roomId = list.value?.get(position)?.roomid
        navigater.startChating(clubId!!,clubImage!!, clubName!!,lastMessage!!,roomId!!)
    }
}
