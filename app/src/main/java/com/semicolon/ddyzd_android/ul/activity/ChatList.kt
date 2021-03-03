package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.RoomData
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.refreshToken


class ChatList : AppCompatActivity() {
    val CODE = 12
    lateinit var viewModel: ChatListViewModel
    lateinit var binding: ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ChatListViewModel(this)
        binding = ActivityChatListBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.lifecycleOwner = this
        viewModel.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onCreate()
    }


    fun startLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivityForResult(intent, CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CODE) {
            if (data != null) {
                if (!data.getBooleanExtra("logined",false)) {
                    finish()
                }else{
                    MainViewModel.accessToken.value = data.getStringExtra("get_access_token").toString()
                    refreshToken.value = data.getStringExtra("get_refresh_token")
                    MainViewModel.userGcn.value = data.getStringExtra("get_gcn").toString()
                    MainActivity.editor.putString("get_refresh_token", refreshToken.value)
                    MainActivity.editor.putString("get_gcn", MainViewModel.userGcn.value)
                    MainActivity.editor.apply()
                }

            }
        }
    }

    fun startChating(data: RoomData) {
        viewModel.socket.disconnect()
        val intent = Intent(this, ChattingPage::class.java)
        intent.putExtra("chatClubId", data.id)
        intent.putExtra("chatClubImage", data.image)
        intent.putExtra("chatClubName", data.name)
        intent.putExtra("chatLastMessage", data.lastmessage)
        intent.putExtra("chatRoomId", data.roomid)
        intent.putExtra("chatIndex", data.index)
        startActivity(intent)
    }


}