package com.semicolon.ddyzd_android.ul.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityMainBinding
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.fragment.*
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken

class MainActivity : AppCompatActivity() {
    private val LOGIN_REQUEST_CODE = 12
    val viewModel = MainViewModel(this)
    val feedViewModel = MainFeedViewModel(this)


    companion object {
        lateinit var startShared: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
        var refreshToken = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        initSharedPreference()
        readAutoLogin()
        viewModel.onCreate(refreshToken)
        val binding: ActivityMainBinding =
            ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, MainFeed(feedViewModel)).commit()
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, MainFeed(feedViewModel)).commit()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.nav_club -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, ClubList(this)).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_my -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, Fragment3()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }

    }

    override fun onResume() {
        super.onResume()
        reLoadFeeds()
    }

    fun reLoadFeeds() {
        feedViewModel.onCreate()
    }

    private fun readAutoLogin() {
        refreshToken = startShared.getString("get_refresh_token", "").toString()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOGIN_REQUEST_CODE) {
            if (data != null) {
                accessToken.value = data.getStringExtra("get_access_token").toString()
                editor.putString("get_refresh_token", refreshToken)
                editor.apply()
                reLoadFeeds()
            }
        }
    }

    fun startClubDetail(club: ClubProfiles) {
        val intent = Intent(this, ClubDetails::class.java)
        intent.putExtra("club_id",club.club_id)
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

    fun showMore(id:Int){
        val showSheet=BottomSheetDialog(id,feedViewModel)
        showSheet.show(supportFragmentManager,"more")
    }

    fun notShowMore(){
        val showSheet=NotSheetDialog()
        showSheet.show(supportFragmentManager,"not more")
    }

}