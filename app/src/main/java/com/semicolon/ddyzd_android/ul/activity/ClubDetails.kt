package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class ClubDetails : AppCompatActivity() {
    lateinit var binding : ActivityClubDetailsBinding
    lateinit var club:ClubProfiles
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        readClub()
        val viewModel= ClubDetailsViewModel(club,this)
        binding  = ActivityClubDetailsBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner=this
        setContentView(binding.root)
    }

    private fun readClub(){
        val image=intent.getStringExtra("image").toString()
        val name=intent.getStringExtra("name").toString()
        val example=intent.getStringExtra("example").toString()
        val clubId=intent.getStringExtra("club_id").toString()
        val backImage=intent.getStringExtra("back")
        club= ClubProfiles(image,name,example,clubId,backImage)
    }
    fun startChatting() {
        val intent = Intent(this, ChatList::class.java)
        startActivity(intent)
    }
}