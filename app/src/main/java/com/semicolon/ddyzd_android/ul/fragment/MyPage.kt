package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FragmentMypageBinding
import com.semicolon.ddyzd_android.viewmodel.MyPageViewModel

class MyPage: Fragment() {
    lateinit var binding:FragmentMypageBinding
    lateinit var viewModel:MyPageViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel= MyPageViewModel(ActivityNavigator.mainActivity)
        viewModel.onCreate()
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_mypage,container,false)
        binding.vm=viewModel
        binding.lifecycleOwner=this
        return binding.root
    }
}