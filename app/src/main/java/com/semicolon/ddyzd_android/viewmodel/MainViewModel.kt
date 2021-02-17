package com.semicolon.ddyzd_android.viewmodel




import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    val accessToken=MutableLiveData<String>()
    fun onCreate(refreshToken:String){
        if(refreshToken.isNotEmpty()){
            readAccessToken(refreshToken)
        }
    }

    private fun readAccessToken(refreshToken: String){

    }

    val liveData : MutableLiveData<String> = MutableLiveData()
    //val liveVisible = MutableLiveData<Boolean>() // 보이는 것
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