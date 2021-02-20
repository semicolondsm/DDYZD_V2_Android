package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.ClubDetailAdapter
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.model.MembersData
import com.semicolon.ddyzd_android.model.Sub
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ClubDetailsViewModel(val club:ClubProfiles,feedViewModel: MainFeedViewModel):ViewModel() {
    private val readMembers=ArrayList<MembersData>()
    val detailAdapter=ClubDetailAdapter(feedViewModel.feeds,club,feedViewModel)
    val isEmpty=MutableLiveData<Int>(View.INVISIBLE)
    val members=MutableLiveData<List<MembersData>>()
    val adapter = BaseApi.getInstance()

    init{
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
            },{})
    }
}


