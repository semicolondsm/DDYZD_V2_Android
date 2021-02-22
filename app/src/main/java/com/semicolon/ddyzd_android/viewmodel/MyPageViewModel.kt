package com.semicolon.ddyzd_android.viewmodel

import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class MyPageViewModel(val navigator: MainActivity) : ViewModel() {
    val adapter = BaseApi.getInstance()

    fun onCreate() {
        readUserInfo()
    }

    private fun readUserInfo(){
        adapter.read
    }
}