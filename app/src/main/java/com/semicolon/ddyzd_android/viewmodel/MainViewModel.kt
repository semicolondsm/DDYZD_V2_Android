package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel(val navigator:MainActivity) :ViewModel(){
    val adapter = BaseApi.getInstance()
    val accessToken=MutableLiveData<String>()
    fun onCreate(refreshToken:String){
        if(refreshToken!=""){
            readAccessToken(refreshToken)
        }
    }

    @SuppressLint("CheckResult")
    private fun readAccessToken(refreshToken: String){
        adapter.readAccessToken("Bearer $refreshToken")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                Log.d("토큰","자동로그인:${it.raw()}")
                if(it.isSuccessful){
                    accessToken.value=it.body()!!.accessToken
                }
                navigator.reLoadFeeds()
            },{
                navigator.startLogin()
            })
    }

}