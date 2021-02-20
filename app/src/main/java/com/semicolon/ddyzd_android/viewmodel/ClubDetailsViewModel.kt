package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ClubDetailAdapter
import com.semicolon.ddyzd_android.adapter.ClubMemberAdapter
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.model.MembersData
import com.semicolon.ddyzd_android.model.Sub
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ClubDetailsViewModel(val club:ClubProfiles,feedViewModel: MainFeedViewModel):ViewModel() {
    private val readMembers=ArrayList<MembersData>()
    val members=MutableLiveData<List<MembersData>>()
    val memberAdapter: ClubMemberAdapter= ClubMemberAdapter(members,this)
    val detailAdapter=ClubDetailAdapter(feedViewModel.feeds,club,feedViewModel,this)
    private val isEmpty=MutableLiveData<Int>(View.INVISIBLE)

    val adapter = BaseApi.getInstance()
    init{
        feedViewModel.onCreate()
        readMembers()
    }
    @SuppressLint("CheckResult")
    private fun readMembers(){
        adapter.clubMember(club.club_id)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    isEmpty.value=View.INVISIBLE
                    it.body()?.let { it1 -> readMembers.addAll(it1) }
                    members.value=readMembers
                }
                memberAdapter.notifyDataSetChanged()
            },{
                memberAdapter.notifyDataSetChanged()
            })
    }
}


