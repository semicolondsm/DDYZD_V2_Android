package com.semicolon.ddyzd_android.ul.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.size
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ClubAdapter
import com.semicolon.ddyzd_android.databinding.ClublistBinding
import com.semicolon.ddyzd_android.model.ClubData
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.ClubListViewModel

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ClubList: Fragment() {

    //lateinit var viewModel : Frag1ViewModel
    private lateinit var binding : ClublistBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val viewModel = ClubListViewModel()
        //binding =Frag1Binding.inflate(inflater,container,false) // 이거는 안됨
        binding= DataBindingUtil.inflate(inflater, R.layout.clublist,container,false)
        binding.frag1 = viewModel
        binding.lifecycleOwner = this

        //binding.frag1 = viewModel
        //binding = Frag1Binding.inflate(R.layout.frag1,container,false)

        val view = inflater.inflate(R.layout.clublist, container,false) // 이거는 됨

        val recyclerView = viewModel.proflieList





        var proflieList = mutableListOf<ClubProfiles>()
        val list = view?.findViewById<RecyclerView>(R.id.rv_proflie)

        lateinit var body : ArrayList<ClubData> // 동아리 전체
        var clubimage = mutableListOf<String>() // 동아리 이미지
        var clubname = mutableListOf<String>() // 동아리 이름
        var clubexample = mutableListOf<String>() //동아리 설명

        val liveData1 : MutableLiveData<String> = MutableLiveData()


        viewModel.liveData1.observe(viewLifecycleOwner,Observer{
            val proflieList = viewModel.proflieList
            list?.layoutManager = LinearLayoutManager(this@ClubList.context, LinearLayoutManager.VERTICAL,false)
            list?.setHasFixedSize(true)
            list?.adapter = ClubAdapter(clubAdapter = proflieList as ArrayList<ClubProfiles>)
        })

        val bottom =view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottom.setOnNavigationItemSelectedListener(viewModel.bottomNavigationView)
        return view.apply {
            println("뷰 보기")
        }
    }


}