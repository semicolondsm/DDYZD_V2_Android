package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FeedFragmentBinding
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class MainFeed(val navigator:MainActivity): Fragment() {
    lateinit var binding:FeedFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.feed_fragment,container,false)
        binding.vm= MainFeedViewModel(navigator)
        binding.lifecycleOwner=this
        return binding.root
    }
}