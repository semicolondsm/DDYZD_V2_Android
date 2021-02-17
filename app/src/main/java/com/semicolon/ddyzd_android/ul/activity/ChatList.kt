package com.semicolon.ddyzd_android.ul.activity

import android.R.attr.data
import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        //val instance= DsmSdk.instance

        binding  = DataBindingUtil.setContentView(this, R.layout.activity_chat_list)
        val viewModel = ChatListViewModel(this)


        binding.vm = viewModel
        setContentView(binding.root)
        println("${accessToken}")
    }
    fun startLogin(){
        val intent=Intent(this,LoginActivity::class.java)
        startActivityForResult(intent,CODE)
    }

}