package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel

class ClubDetails : AppCompatActivity() {
    lateinit var binding : ActivityClubDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel= ClubDetailsViewModel()
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_club_details)
        binding.vm = viewModel

    }
}