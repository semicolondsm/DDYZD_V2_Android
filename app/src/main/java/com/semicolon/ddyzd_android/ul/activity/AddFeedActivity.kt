package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityAddFeedBinding
import com.semicolon.ddyzd_android.viewmodel.AddFeedViewModel

class AddFeedActivity : AppCompatActivity() {
    lateinit var binding:ActivityAddFeedBinding
    val viewModel=AddFeedViewModel(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddFeedBinding.inflate(layoutInflater)
        binding.vm=viewModel
        setContentView(binding.root)
    }
}