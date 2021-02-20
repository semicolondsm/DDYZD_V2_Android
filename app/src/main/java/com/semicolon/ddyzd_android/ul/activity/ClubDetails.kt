package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class ClubDetails(private val club:ClubProfiles) : AppCompatActivity() {
    lateinit var binding : ActivityClubDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel= ClubDetailsViewModel(club)
        binding  = ActivityClubDetailsBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner=this
        setContentView(binding.root)
    }
}