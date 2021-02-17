package com.semicolon.ddyzd_android.ul.activity

import android.R.attr.data
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel


class ChatList : AppCompatActivity() {
    var accessToken = ""
    var refreshToken = ""
    val CODE = 1
    lateinit var binding : ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val instance= DsmSdk.instance

        binding  = DataBindingUtil.setContentView(this, R.layout.activity_chat_list)
        val viewModel = ChatListViewModel(this)


        binding.vm = viewModel
        setContentView(binding.root)
        println("${accessToken},${refreshToken}")
    }

    fun inentLoginActivity(CODE : Int){
        val intent : Intent = Intent(applicationContext, LoginActivity().javaClass)
        startActivityForResult(intent, CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == CODE){
            accessToken = data?.getStringExtra("get_access_token").toString()
            refreshToken = data?.getStringExtra("get_access_token").toString()
            binding.vm?.callChatList(this,accessToken)
        }
    }


}