package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.dsm_sdk_v1.DTOtoken
import com.semicolon.dsm_sdk_v1.DTOuser
import com.semicolon.dsm_sdk_v1.DsmSdk
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginViewModel(val instance: DsmSdk, val context: LoginActivity,private val deviceToken:String) : ViewModel() {
    var accessToken = ""
    var refreshToken = ""
    val adapter = BaseApi.getInstance()
    lateinit var userName:String
    lateinit var userEmail:String
    lateinit var userGcn:String
    val loading=MutableLiveData<Int>(View.INVISIBLE)
    fun startLogin() {
        loading.value=View.VISIBLE
        val tokenCallback: (DTOtoken?, Throwable?) -> Unit = { token, error ->
            if (error != null) {
            } else if (token != null) {
                accessToken = token.access_token
                refreshToken = token.refresh_token
            }
        }
        val loginCallback: (DTOuser?) -> Unit = {
            if (it != null) {
                userName = it.name
                userEmail = it.email
                userGcn = it.gcn
                readToken(accessToken)
            }
        }
        instance.loginWithAuth(context, tokenCallback, loginCallback)
    }
    @SuppressLint("CheckResult")
    private fun readToken(accessToken: String) {
        adapter.readToken("Bearer $accessToken")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ response ->
                if (response.isSuccessful) {
                    val getRefreshToken = response.body()!!.refreshToken
                    val getAccessToken = response.body()!!.accessToken
                    finishLogin(userName, userEmail, userGcn,getRefreshToken,getAccessToken)
                }
            }, {
            })
    }
    private fun finishLogin(
        name: String,
        email: String,
        gcn: String,
        refreshToken:String,
        accessToken: String
    ) {
        loading.value=View.INVISIBLE
        addDeviceToken(accessToken)
        context.finish(true,name, email, gcn, accessToken, refreshToken)
    }
    @SuppressLint("CheckResult")
    private fun addDeviceToken(accessToken: String){
        adapter.addDeviceToken("Bearer $accessToken","Bearer $deviceToken")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                
            },{
            })
    }

    fun startWithoutLogin() {
       context.finish(false,"","","","","")
    }
}