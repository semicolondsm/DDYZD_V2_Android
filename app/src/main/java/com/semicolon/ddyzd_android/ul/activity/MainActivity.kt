package com.semicolon.ddyzd_android.ul.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityMainBinding
import com.semicolon.ddyzd_android.ul.fragment.ClubList
import com.semicolon.ddyzd_android.ul.fragment.MainFeed
import com.semicolon.ddyzd_android.ul.fragment.Fragment3
import com.semicolon.ddyzd_android.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {
    private val REQUEST_LOGIN_CODE=1306
    private lateinit var startShared:SharedPreferences
    private lateinit var editor:SharedPreferences.Editor

    var userName=""   //받아온 사용자 이름
    var userEmail="" //받아온 사용자 이메일
    var userGcn=""   //받아온 사용자 학번

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = MainViewModel()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        initPreference()
        if(readAutoLogin()){
            val intent=Intent(this,
                LoginActivity::class.java)
            startActivityForResult(intent,REQUEST_LOGIN_CODE)
        }
        setContentView(binding.root)
        viewModel.liveData.observe(this, Observer{
            when (viewModel.liveData.value) {
                "1" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, ClubList(this)).commit()
                "2" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, MainFeed()).commit()
                "3" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, Fragment3()).commit()
            }
        })
    }

    private fun initPreference(){
        startShared=getSharedPreferences("auto_login", Context.MODE_PRIVATE)
        editor=startShared.edit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==REQUEST_LOGIN_CODE){
            userName=data!!.getStringExtra("get_name").toString()
            userEmail=data.getStringExtra("get_email").toString()
            userGcn=data.getStringExtra("get_gcn").toString()
            val accessToken=data.getStringExtra("get_access_token").toString()
            val refreshToken=data.getStringExtra("get_refresh_token").toString()
            if(data.getBooleanExtra("do_auto_login",false)){
                editor.putString("get_name",userName)
                editor.putString("get_email",userEmail)
                editor.putString("get_gcn",userGcn)
                editor.apply()
            }
        }
    }

    private fun readAutoLogin():Boolean{// 자동로그인 하는 함수
        if(startShared.getString("get_name",null)==null){
            return true
        }
        userName=startShared.getString("get_name","").toString()
        userEmail=startShared.getString("get_email","").toString()
        userGcn=startShared.getString("get_gcn","").toString()
        return false
    }

    fun changeActivity(){
        val intent = Intent(this, ClubDetails::class.java)
        startActivity(intent)
    }

}