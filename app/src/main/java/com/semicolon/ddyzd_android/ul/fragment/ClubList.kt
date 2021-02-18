package com.semicolon.ddyzd_android.ul.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ClubAdapter
import com.semicolon.ddyzd_android.databinding.FragmentClublistBinding
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.ClubListViewModel


class ClubList(val navigator:MainActivity): Fragment() {

    lateinit var mContext: Context
    private lateinit var binding : FragmentClublistBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val viewModel = ClubListViewModel(navigator)
        mContext=navigator.applicationContext
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_clublist,container,false)
        binding.frag1 = viewModel
        binding.lifecycleOwner = this
        val view = inflater.inflate(R.layout.fragment_clublist, container,false) // 이거는 됨
        val list = view?.findViewById<RecyclerView>(R.id.rv_proflie)
        viewModel.liveData1.observe(viewLifecycleOwner,Observer{
            val proflieList = viewModel.proflieList
            list?.layoutManager = LinearLayoutManager(this@ClubList.context, LinearLayoutManager.VERTICAL,false)
            list?.setHasFixedSize(true)
            list?.adapter = ClubAdapter(clubAdapter = proflieList as ArrayList<ClubProfiles>,navigator = navigator)
        })

        return view
    }




}