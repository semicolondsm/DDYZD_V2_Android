package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.databinding.ActivityLoginBinding
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel

class ChatList : AppCompatActivity() {
    lateinit var binding : ActivityChatListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel= ChatListViewModel()
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_club_details)
        binding.vm = viewModel
    }
}