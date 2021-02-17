package com.semicolon.ddyzd_android.ul.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityMainBinding
import com.semicolon.ddyzd_android.ul.fragment.ClubList
import com.semicolon.ddyzd_android.ul.fragment.MainFeed
import com.semicolon.ddyzd_android.ul.fragment.Fragment3
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import io.reactivex.rxjava3.exceptions.UndeliverableException
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import java.io.IOException
import java.net.SocketException

class MainActivity : AppCompatActivity() {
    private val LOGIN_REQUEST_CODE = 12
    private lateinit var startShared: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    val viewModel = MainViewModel(this)
    var refreshToken = ""

    companion object {
        var accessToken = ""  //access token 쓸때 이거 쓰세요(MainActivity.accessToken)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSharedPreference()
        readAutoLogin()
        viewModel.onCreate(refreshToken)
        observeAccessToken()
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        setContentView(binding.root)
        viewModel.liveData.observe(this, Observer {
            when (viewModel.liveData.value) {
                "1" -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, ClubList(this)).commit()
                "2" -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment, MainFeed(this)).commit()
                "3" -> supportFragmentManager.beginTransaction().replace(R.id.fragment, Fragment3())
                    .commit()
            }
        })

    }

    private fun observeAccessToken() {
        viewModel.accessToken.observe(this, Observer {
            accessToken=it
        })
    }

    private fun readAutoLogin(){
        refreshToken=startShared.getString("get_refresh_token","").toString()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOGIN_REQUEST_CODE) {
            if (data != null) {
                accessToken = data.getStringExtra("get_access_token").toString()
                refreshToken = data.getStringExtra("get_refresh_token").toString()
                editor.putString("get_refresh_token", refreshToken)
                editor.apply()
            }
        }
    }


    fun changeActivity() {
        val intent = Intent(this, ClubDetails::class.java)
        startActivity(intent)
    }

    fun startChatting() {
        val intent = Intent(this, ChatList::class.java)
        startActivity(intent)
    }

    fun startLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivityForResult(intent, LOGIN_REQUEST_CODE)
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun initSharedPreference() {
        startShared =
            getSharedPreferences("auto_login", Context.MODE_PRIVATE)
        editor = startShared.edit()
    }
}