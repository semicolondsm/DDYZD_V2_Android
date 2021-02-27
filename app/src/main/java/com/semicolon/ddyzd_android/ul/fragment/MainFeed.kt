package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FragmentFeedBinding
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class MainFeed: Fragment() {
    lateinit var binding:FragmentFeedBinding
    lateinit var feedViewModel:MainFeedViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_feed,container,false)
        feedViewModel=MainFeedViewModel(ActivityNavigator.mainActivity)
        feedViewModel.onCreate()
        binding.vm= feedViewModel
        binding.lifecycleOwner=this
        return binding.root
    }

}