package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.adapter.ChattingAdapter
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ChattingData
import com.semicolon.ddyzd_android.ul.activity.ChattingPage
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.socket.client.IO
import io.socket.client.Manager
import io.socket.client.Socket
import io.socket.emitter.Emitter
import io.socket.engineio.client.Transport
import org.json.JSONObject
import java.net.URISyntaxException
import java.util.*

class ChattingPageViewModel(val navigater : ChattingPage) : ViewModel() {




    val chattingList = MutableLiveData<List<ChattingData>>()
    val roomid = navigater.roomId
    val clubImage = navigater.clubImage
    val clubName = navigater.clubName
    val index = navigater.index
    val section = navigater.club_section
    val adapter = BaseApi.getInstance()
    val chatBody = MutableLiveData("가나다라")
    private var readChattingList = mutableListOf<ChattingData>()
    var roomToken : String = ""
    val chattingListAdapter = ChattingAdapter(chattingList, this,index,clubName,section)

    private lateinit var socket : Socket

    init {
        getChatting()
        getRoomToken()
    }
    @SuppressLint("CheckResult")
    private fun getChatting() { // 채팅 데이터 가져오기
        adapter.getChatting(roomid,"Bearer ${accessToken.value}" )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    println("${response.body()} 이게 채팅 ")
                    response.body()?.let { readChattingList.addAll(it) }
                    chattingList.value = readChattingList
                    chattingListAdapter.notifyDataSetChanged()

                }
            }, {
            })
    }

    @SuppressLint("CheckResult")
    private fun getRoomToken(){ /// 룸 토큰 가져오는 것
        adapter.getRoomToken("Bearer ${accessToken.value}",roomid)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    roomToken = response.body()!!.room_token
                    startSocket("${accessToken.value}")
                }
            }, {
            })
    }


    fun joinRoom(){ // 방 입장 소켓
        val data = JSONObject()
        data.put("room_token",roomToken)
        socket.emit("join_room",data)
        socket.on("error",event)
    }

    fun sandChatting(){ // 보내기 버튼 누르면 실행 소켓

        val message = chatBody.value
        println(chatBody)
        val data = JSONObject()
        data.put("room_token",roomToken)
        data.put("msg",message)
        socket.emit("send_chat",data)
        socket.on("response",event)
        socket.on("recv_chat",event)
    }


    fun startSocket(accessToken: String){
        try {
            val opts  = IO.Options()
            opts.transports  = arrayOf(io.socket.engineio.client.transports.WebSocket.NAME) // xhr에러 방지
            socket = IO.socket("https://api.eungyeol.live/chat",opts)
            socket.io().on(Manager.EVENT_TRANSPORT, Emitter.Listener { args ->
                val trans = args[0] as Transport
                trans.on(Transport.EVENT_REQUEST_HEADERS){ // request 해더 넣는 부분
                        args->val mHeaders = args[0] as MutableMap<String, List<String>>
                    println("여기가 실행${accessToken}")
                    mHeaders["Authorization"] = Arrays.asList("Bearer ${accessToken}")
                }
            })
            socket.on(Socket.EVENT_CONNECT) {
                println("성공")
            }.on(Socket.EVENT_CONNECT_ERROR) {
                println("실패;;")
                println(it.contentToString()) // 이게 에러 받는거입니다
            }
            socket.on("response",event)
            socket.on("hello",event)
            sandChatting()
            joinRoom()
            socket.connect()
        } catch (e: URISyntaxException) {
            println(e.reason)
        }
    }

    val event : Emitter.Listener =Emitter.Listener{
        val size = it.size-1
        val data  = it
        for(i in 0..size){
            println("${data[i]} 이게 결과값")
        }
    }

}