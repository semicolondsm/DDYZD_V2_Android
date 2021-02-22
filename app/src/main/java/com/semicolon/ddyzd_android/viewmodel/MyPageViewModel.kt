package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.UserClubsAdapter
import com.semicolon.ddyzd_android.model.UserClubData
import com.semicolon.ddyzd_android.model.UserInfoData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.userGcn
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MyPageViewModel(val navigator: MainActivity) : ViewModel() {
    val adapter = BaseApi.getInstance()
    val userInfo=MutableLiveData<UserInfoData>()

    val userClubs=MutableLiveData<List<UserClubData>>()
    val clubAdapter=UserClubsAdapter(userClubs)

    fun onCreate() {
        readUserInfo()
    }

    @SuppressLint("CheckResult")
    private fun readUserInfo(){
        adapter.readUserInfo("Bearer ${accessToken.value}",userGcn.value.toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    userInfo.value=it.body()
                    userClubs.value= it.body()?.clubs
                    clubAdapter.notifyDataSetChanged()
                }else{
                    navigator.startLogin()
                }
            },{
                navigator.startLogin()
            })
    }

    fun onClubDetailClicked(clubId:String){
        navigator.startClubDetail(clubId)
    }
}