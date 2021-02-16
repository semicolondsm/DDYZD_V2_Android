package com.semicolon.ddyzd_android.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.ul.activity.LoginActivity
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.dsm_sdk_v1.DTOtoken
import com.semicolon.dsm_sdk_v1.DTOuser
import com.semicolon.dsm_sdk_v1.DsmSdk
import kotlin.math.log

class LoginViewModel(val instance: DsmSdk, val context: LoginActivity) : ViewModel() {
    var accessToken = ""
    var refreshToken = ""
    fun startLogin() {
        val tokenCallback: (DTOtoken?, Throwable?) -> Unit = { token, error ->
            if (error != null) {
                Log.d("에러", "로그인: ${error.toString()}")
            } else if (token != null) {
                accessToken = token.access_token
                refreshToken = token.refresh_token

            }
        }
        val loginCallback: (DTOuser?) -> Unit = {
            val userName = it?.name
            val userEmail = it?.name
            val userGcn = it?.gcn
            if (it != null) {
                finishLogin(userName!!, userEmail!!, userGcn!!, accessToken, refreshToken)
            }
        }
        instance.loginWithAuth(context, tokenCallback, loginCallback)
    }


    private fun finishLogin(
        name: String,
        email: String,
        gcn: String,
        accessToken: String,
        refreshToken: String
    ) {
        context.finish(name, email, gcn, accessToken, refreshToken).apply {
        }
    }

    fun startWithoutLogin() {

    }
}