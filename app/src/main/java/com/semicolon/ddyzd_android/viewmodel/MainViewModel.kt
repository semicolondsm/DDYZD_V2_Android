package com.semicolon.ddyzd_android.viewmodel




import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){


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