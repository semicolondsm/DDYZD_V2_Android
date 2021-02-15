package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.LoginViewModel
import com.semicolon.dsm_sdk_v1.DsmSdk

class ChatList : AppCompatActivity() {
    lateinit var binding : ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val instance= DsmSdk.instance
        val viewModel= ChatListViewModel(LoginViewModel(instance , LoginActivity()))
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_club_details)
        binding.vm = viewModel
    }
}