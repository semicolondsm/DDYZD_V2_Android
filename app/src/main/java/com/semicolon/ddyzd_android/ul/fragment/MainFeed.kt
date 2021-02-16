package com.semicolon.ddyzd_android.ul.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FragmentFeedBinding
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class MainFeed(val navigator:MainActivity): Fragment() {
    lateinit var binding:FragmentFeedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_feed,container,false)
        val viewModel=MainFeedViewModel(navigator)
        viewModel.callApi.value=0
        viewModel.onCreate()
        binding.vm= viewModel
        binding.lifecycleOwner=this
        return binding.root
    }
}