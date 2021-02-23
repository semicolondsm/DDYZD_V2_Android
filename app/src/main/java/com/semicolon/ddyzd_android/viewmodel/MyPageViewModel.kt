package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.adapter.UserClubsAdapter
import com.semicolon.ddyzd_android.model.UserClubData
import com.semicolon.ddyzd_android.model.UserInfoData
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.fragment.ModifySheet
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.userGcn
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MyPageViewModel(val navigator: MainActivity) : ViewModel() {
    val adapter = BaseApi.getInstance()
    val userInfo=MutableLiveData<UserInfoData>()

    val userClubs=MutableLiveData<List<UserClubData>>()
    val clubAdapter=UserClubsAdapter(userClubs,this)

    val modifyIntro=MutableLiveData<String>()
    val modifyGit=MutableLiveData<String>()

    fun onCreate() {
        readUserInfo()
    }

    @SuppressLint("CheckResult")
    private fun readUserInfo(){
        adapter.readUserInfo("Bearer ${accessToken.value}",userGcn.value.toString())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    userInfo.value=it.body()
                    modifyIntro.value= it.body()?.introduce
                    modifyGit.value= it.body()?.github
                    userClubs.value= it.body()?.clubs
                    clubAdapter.notifyDataSetChanged()
                }else{
                    navigator.startLogin()
                }
            },{
                navigator.startLogin()
            })
    }


    fun onClubDetailClicked(clubId:String){
        navigator.startClubDetail(clubId)
    }


    /**
     * 수정 선택하는 코드
     */
    fun onEditProfileClicked(){
        navigator.modifyInfo()
    }

    /**
     * 깃허브 정보 수정하는 코드
     */
    fun onGitEditClicked(){
        navigator.disModifyInfo()
        navigator.showEditGit()
    }

    fun onGitDoneClicked(){
        editGithub()
        navigator.disEditGit()
    }

    @SuppressLint("CheckResult")
    private fun editGithub(){
        val bodyMap= mutableMapOf<String,String?>()
        bodyMap["git"]=modifyGit.value
        adapter.editGithub("Bearer ${accessToken.value}",bodyMap)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    navigator.showToast("Github Id 를 수정하였습니다")
                    onCreate()
                }
            },{
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })
    }

    /**
     * 소개 수정 시작,끝내는 코드
     */
    fun onModifyIntroClicked(){
        navigator.disModifyInfo()
        navigator.showModifyIntro()
    }

    fun onDoneIntroduceClicked(){
        startModify(modifyIntro.value)
        navigator.disModifyIntro()
    }

    @SuppressLint("CheckResult")
    fun startModify(intro:String?){
        val bodyMap= mutableMapOf<String,String?>()
        bodyMap["bio"]=intro
        adapter.modifyUserIntro("Bearer ${accessToken.value}",bodyMap)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if(it.isSuccessful){
                    navigator.showToast("소개를 수정하였습니다")
                    onCreate()
                }
            },{
                navigator.showToast("인터넷 문제가 발생하였습니다")
            })
    }
}