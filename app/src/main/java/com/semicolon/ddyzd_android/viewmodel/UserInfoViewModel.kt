package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.InUserClubsAdapter
import com.semicolon.ddyzd_android.model.UserClubData
import com.semicolon.ddyzd_android.model.UserInfoData
import com.semicolon.ddyzd_android.ul.activity.ClubDetails
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserInfoViewModel(val navigator: ClubDetails,val gcn:String): ViewModel() {
    val adapter = BaseApi.getInstance()
    val userInfo= MutableLiveData<UserInfoData>()

    val userClubs= MutableLiveData<List<UserClubData>>()
    val clubAdapter= InUserClubsAdapter(userClubs,this)

    val modifyIntro= MutableLiveData<String>()
    val modifyGit= MutableLiveData<String>()

    fun onCreate() {
        readUserInfo()
    }

    @SuppressLint("CheckResult")
    private fun readUserInfo(){
        adapter.readUserInfo("Bearer ${MainViewModel.accessToken.value}", gcn)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    userInfo.value=it.body()
                    modifyIntro.value= it.body()?.introduce
                    modifyGit.value= it.body()?.github
                    userClubs.value= it.body()?.clubs
                    clubAdapter.notifyDataSetChanged()
                }else{
                    navigator.startLogin()
                }
            },{
                navigator.startLogin()
            })
    }

    fun onBackClicked(){
        navigator.closeUser()
    }

    fun onClubDetailClicked(clubId:String){
        navigator.startClubDetail(clubId)
    }

    fun onGithubProfileClicked(){
        navigator.startGithub(userInfo.value?.github)
    }
}