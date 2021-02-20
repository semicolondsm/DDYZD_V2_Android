package com.semicolon.ddyzd_android.viewmodel




import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.socket.client.Socket

class MainViewModel(val navigator:MainActivity) :ViewModel(){
    val adapter = BaseApi.getInstance()
    val accessToken=MutableLiveData<String>()
    fun onCreate(refreshToken:String){
        if(refreshToken.isNotEmpty()){
            readAccessToken(refreshToken)
        }
    }

    @SuppressLint("CheckResult")
    private fun readAccessToken(refreshToken: String){
        adapter.readAccessToken(refreshToken)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    accessToken.value=it.body()!!.accessToken
                }

            },{
                navigator.startLogin()
            })
    }

    val liveData : MutableLiveData<String> = MutableLiveData()
    fun changeclub() {
        liveData.value = "1"
    }
    fun changechat(){
        liveData.value = "2"
    }
    fun changeelse(){
        liveData.value = "3"
    }


}