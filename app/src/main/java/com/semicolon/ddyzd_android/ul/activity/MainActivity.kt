package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = MainViewModel()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        setContentView(binding.root)
        viewModel.liveData.observe(this, Observer{
            when (viewModel.liveData.value) {
                "1" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, ClubList(this)).commit()
                "2" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, MainFeed(this)).commit()
                "3" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, Fragment3()).commit()
            }
        })
    }


    fun changeActivity(){
        val intent = Intent(this, ClubDetails::class.java)
        startActivity(intent)
    }

    fun startChatting(){
        //여기에 채팅 시작하는 코드 넣어주세요
    }

}