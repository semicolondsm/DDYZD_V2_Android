package com.semicolon.ddyzd_android.viewmodel


import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.model.AccessTokenData
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.RoomData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.socket.client.IO
import io.socket.client.Manager
import io.socket.client.Socket
import io.socket.emitter.Emitter
import io.socket.engineio.client.Transport
import org.json.JSONObject
import java.net.URI
import java.net.URISyntaxException
import java.util.*
import kotlin.collections.ArrayList

class ChatListViewModel(val navigater: ChatList) : ViewModel() {
    private val apiAdapter = BaseApi.getInstance()
    private lateinit var readChatList : ChatListData
    val list = MutableLiveData<ChatListData>()
    val clubListAdapter = ChatListAdapter(list, this)
    val value = listOf<String>()
    private lateinit var socket : Socket

    init{
        callChatList(navigater)
    }
    val userId = JSONObject()

    fun onDestroy(){
        socket.disconnect()
    }
    fun onCreate() {
        callChatList(navigater)
        accessToken.value?.let { startSocket(it) }
    }


    @SuppressLint("CheckResult")
    fun callChatList(navigater: ChatList) {
        apiAdapter.chatList("Bearer ${accessToken.value}")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    // 이 부분이 어뎁터
                        if(response.body() != null){
                            readChatList = response.body()!!
                            println("${response.body()}")
                            list.value = readChatList
                            clubListAdapter.notifyDataSetChanged()
                            startSocket("${accessToken.value}")

                        }

                } else {
                    navigater.startLogin()
                }
            }, { throwable ->
                println("${throwable.message}")
            })
    }
    fun goChatting(data: RoomData, section: ArrayList<String>){
        navigater.startChating(data,section)
    }

        //소켓 부분
    fun startSocket(accessToken: String){
        val value = mutableListOf<String>("Bearer${accessToken}").apply {
            println("${accessToken} 가나다라마바사")
        }
        try {
            val opts  = IO.Options()
            opts.transports  = arrayOf(io.socket.engineio.client.transports.WebSocket.NAME) // xhr에러 방지
            socket = IO.socket("https://api.eungyeol.live/chat",opts)
            socket.io().on(Manager.EVENT_TRANSPORT, Emitter.Listener {args ->
                val trans = args[0] as Transport
                trans.on(Transport.EVENT_REQUEST_HEADERS){ // request 해더 넣는 부분
                        args->val mHeaders = args[0] as MutableMap<String, List<String>>
                    println("여기가 실행${accessToken}")
                    mHeaders["Authorization"] = Arrays.asList("Bearer ${accessToken}")
                }
            })
            socket.on(Socket.EVENT_CONNECT) {
                println("성공")
                socket.emit("response","제발 되라 ㅜㅜㅜ")
            }.on(Socket.EVENT_CONNECT_ERROR) {
                println("실패;;")
                println(it.contentToString())
            }
            socket.on("response",event)
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
