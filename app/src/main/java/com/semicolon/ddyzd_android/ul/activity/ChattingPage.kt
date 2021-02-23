package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding
import com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel

class ChattingPage : AppCompatActivity() {
    var roomId =""
    var clubImage = ""
    var clubName = ""
    lateinit var binding  : ActivityChattingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        roomId = intent.getStringExtra("chatClubId").toString()
        clubImage = intent.getStringExtra("chatClubImage").toString()
        clubName  = intent.getStringExtra("chatClubName").toString()

        binding = ActivityChattingPageBinding.inflate(layoutInflater)
        val viewModel = ChattingPageViewModel(this)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)


    }
}