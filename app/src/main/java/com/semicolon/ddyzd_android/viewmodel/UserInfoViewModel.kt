package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.InUserClubsAdapter
import com.semicolon.ddyzd_android.model.UserClubData
import com.semicolon.ddyzd_android.model.UserInfoData
import com.semicolon.ddyzd_android.ul.activity.ClubDetails
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserInfoViewModel(val navigator: ClubDetails, val gcn: String) : ViewModel() {
    val adapter = BaseApi.getInstance()
    val userInfo = MutableLiveData<UserInfoData>()

    private val userClubs = MutableLiveData<List<UserClubData>>()
    val clubAdapter = InUserClubsAdapter(userClubs, this)

    val progressVisible=MutableLiveData<Int>(View.INVISIBLE)
    lateinit var setToken:String

    fun onCreate() {
        progressVisible.value=View.VISIBLE
        readUserInfo()
    }

    @SuppressLint("CheckResult")
    private fun readUserInfo() {
        if(!accessToken.value.isNullOrEmpty()){
            setToken= accessToken.value!!
        }
        adapter.readUserInfo(setToken, gcn)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    userInfo.value = it.body()
                    userClubs.value = it.body()?.clubs
                    clubAdapter.notifyDataSetChanged()
                }
                progressVisible.value=View.INVISIBLE
            }, {
                navigator.showToast("인터넷 문제가 발생하였습니다")
                progressVisible.value=View.INVISIBLE
            })
    }

    fun onBackClicked() {
        navigator.closeUser()
    }

    fun onClubDetailClicked(clubId: String) {
        navigator.startClubDetail(clubId)
    }

    fun onGithubProfileClicked() {
        navigator.startGithub(userInfo.value?.github)
    }
}