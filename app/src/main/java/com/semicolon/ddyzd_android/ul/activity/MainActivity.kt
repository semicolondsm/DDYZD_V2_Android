package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityMainBinding
import com.semicolon.ddyzd_android.ul.fragment.ClubList
import com.semicolon.ddyzd_android.ul.fragment.Fragment2
import com.semicolon.ddyzd_android.ul.fragment.Fragment3
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.dsm_sdk_v1.DsmSdk


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val instance=DsmSdk.instance
        instance.initSDK("qwer","qwer","http://www.google.com")
        val viewModel = MainViewModel()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        //val liveData = MainViewModel().liveData
        viewModel.liveData.observe(this, Observer{
            println("바뀌나")
            when (viewModel.liveData.value) {
                "1" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, ClubList(this)).commit()
                "2" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, Fragment2()).commit()
                "3" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, Fragment3()).commit()
            }
        })
    }
    fun changeActivity(){
        val intent = Intent(this, ClubDetails::class.java)
        startActivity(intent)
    }


}