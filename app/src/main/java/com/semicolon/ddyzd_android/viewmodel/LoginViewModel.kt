package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.dsm_sdk_v1.DTOtoken
import com.semicolon.dsm_sdk_v1.DTOuser
import com.semicolon.dsm_sdk_v1.DsmSdk
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginViewModel(val instance: DsmSdk, val context: LoginActivity) : ViewModel() {
    var accessToken = ""
    var refreshToken = ""
    val adapter = BaseApi.getInstance()
    fun startLogin() {
        val tokenCallback: (DTOtoken?, Throwable?) -> Unit = { token, error ->
            if (error != null) {
                Log.d("에러", "로그인: ${error.toString()}")
            } else if (token != null) {
                accessToken = token.access_token
                refreshToken = token.refresh_token
                readToken(accessToken)
            }
        }

        val loginCallback: (DTOuser?) -> Unit = {
            val userName = it?.name
            val userEmail = it?.email
            val userGcn = it?.gcn
            if (it != null) {
                finishLogin(userName!!, userEmail!!, userGcn!!)
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
                    Log.d("토큰",response.body()!!.toString())
                    this.refreshToken = response.body()!!.refreshToken
                    this.accessToken = response.body()!!.accessToken
                    MainActivity.accessToken= response.body()!!.accessToken
                } else {
                    Log.e("token", response.message())
                }
            }, {
                Log.e("token", it.toString())
            })
    }

    private fun finishLogin(
        name: String,
        email: String,
        gcn: String
    ) {
        Log.d("토큰",accessToken)
        context.finish(name, email, gcn, accessToken, refreshToken)
    }

    fun startWithoutLogin() {
        context.finish()
    }
}