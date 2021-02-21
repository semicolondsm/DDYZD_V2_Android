package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel

class ClubDetails : AppCompatActivity() {
    lateinit var binding : ActivityClubDetailsBinding
    lateinit var clubId:String
    lateinit var viewModel: ClubDetailsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        clubId=intent.getStringExtra("club_id").toString()
        viewModel= ClubDetailsViewModel(clubId,this)
        viewModel.onCreate()
        binding  = ActivityClubDetailsBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner=this
        setContentView(binding.root)
    }

    fun startChatting() {
        val intent = Intent(this, ChatList::class.java)
        startActivity(intent)
    }

    fun showToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}