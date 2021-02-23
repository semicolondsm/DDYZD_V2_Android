package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.FragmentUserInfoBinding
import com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel

class UserInfo: Fragment() {
    lateinit var binding:FragmentUserInfoBinding
    lateinit var viewModel: UserInfoViewModel
    lateinit var gcn:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel=UserInfoViewModel(ActivityNavigator.clubDetailActivity,gcn)
        viewModel.onCreate()
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_user_info,container,false)
        binding.vm=viewModel
        binding.lifecycleOwner=this
        return binding.root
    }

}