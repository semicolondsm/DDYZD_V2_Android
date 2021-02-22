package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel


class ChatList : AppCompatActivity() {
    val CODE = 12
    val viewModel = ChatListViewModel(this)
    lateinit var binding : ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatListBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)
        viewModel.onCreate()
    }
    fun startLogin(){
        val intent=Intent(this,LoginActivity::class.java)
        startActivityForResult(intent,CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CODE) {
            if (data != null) {
                MainViewModel.accessToken.value = data.getStringExtra("get_access_token").toString()
                MainViewModel.userGcn.value=data.getStringExtra("get_gcn").toString()
                MainActivity.editor.putString("get_refresh_token", MainActivity.refreshToken)
                MainActivity.editor.apply()
                viewModel.onCreate()
            }
        }
    }

    fun startChating(data : ChatListData){
        val intent = Intent(this,ChattingPage::class.java)
        intent.putExtra("chatClubId",data.clubid)
        intent.putExtra("chatClubImage",data.clubimage)
        intent.putExtra("chatClubName",data.clubname)
        intent.putExtra("chatLastMessage",data.lastmessage)
        intent.putExtra("chatRoomId",data.roomid)
        startActivity(intent)
    }

}