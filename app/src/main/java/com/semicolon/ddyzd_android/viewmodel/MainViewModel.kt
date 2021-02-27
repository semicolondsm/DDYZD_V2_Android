package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel(val navigator:MainActivity) :ViewModel(){
    val adapter = BaseApi.getInstance()

    companion object{
        val accessToken=MutableLiveData<String>()
        val refreshToken=MutableLiveData<String>()
        val userGcn=MutableLiveData<String>()
    }

    fun onCreate(){
        if(!refreshToken.value.isNullOrEmpty()){
            readAccessToken(refreshToken.value!!)
        }else{
            navigator.createFeeds()
        }
        return
    }

    @SuppressLint("CheckResult")
    private fun readAccessToken(refreshToken: String){
        adapter.readAccessToken("Bearer $refreshToken")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    accessToken.value=it.body()!!.accessToken
                }
                navigator.createFeeds()
            },{
            })
    }

}