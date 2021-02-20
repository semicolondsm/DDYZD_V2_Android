package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding
import com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel

class ChattingPage : AppCompatActivity() {
    lateinit var binding  : ActivityChattingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChattingPageBinding.inflate(layoutInflater)
        val viewModel = ChattingPageViewModel()
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)

    }
}