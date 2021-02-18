package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.accessToken
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel


class ChatList : AppCompatActivity() {
    val CODE = 12
    lateinit var binding : ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatListBinding.inflate(layoutInflater)
        val viewModel = ChatListViewModel(this)
        binding.vm = viewModel
        setContentView(binding.root)
    }
    fun startLogin(){
        val intent=Intent(this,LoginActivity::class.java)
        startActivityForResult(intent,CODE)
    }
    fun startChating(clubId : String,clubImage : String, clubName : String,lastMessage: String,roomId: String){
        val intent = Intent(this,ChattingPage::class.java)
        intent.putExtra("chatClubId",clubId)
        intent.putExtra("chatClubImage",clubImage)
        intent.putExtra("chatClubName",clubName)
        intent.putExtra("chatLastMessage",lastMessage)
        intent.putExtra("chatRoomId",roomId)
        startActivity(intent)
    }

}