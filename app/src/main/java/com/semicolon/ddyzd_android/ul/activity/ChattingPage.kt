package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding
import com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel
import java.util.ArrayList

class ChattingPage : AppCompatActivity() {
    var roomId =""
    var clubImage = ""
    var clubName = ""
    var index = 0
    //var club_section = ArrayList<String>()
    lateinit var binding  : ActivityChattingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        roomId = intent.getStringExtra("chatRoomId").toString()
        clubImage = intent.getStringExtra("chatClubImage").toString()
        clubName  = intent.getStringExtra("chatClubName").toString()
        index = intent.getIntExtra("chatIndex",0)
        //club_section = intent.getStringArrayListExtra("chatClubSection") as ArrayList<String>
        println("$roomId 이게 룸아이디")

        binding = ActivityChattingPageBinding.inflate(layoutInflater)
        val viewModel = ChattingPageViewModel(this)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)


    }
}