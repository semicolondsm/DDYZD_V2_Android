package com.semicolon.ddyzd_android.ul.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityMainBinding
import com.semicolon.ddyzd_android.ul.fragment.*
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.refreshToken
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.userGcn
import com.semicolon.ddyzd_android.viewmodel.MyPageViewModel

class MainActivity : AppCompatActivity() {
    private val LOGIN_REQUEST_CODE = 12
    val viewModel = MainViewModel(this)
    lateinit var binding:ActivityMainBinding

    companion object {
        lateinit var startShared: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initSharedPreference()
        ActivityNavigator.mainActivity=this
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        viewModel.onCreate()
        binding=
            ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        setContentView(binding.root)
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, MainFeed()).commit()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.nav_club -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, ClubList()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_my -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, MyPage()).commit()
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

    fun createFeeds(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, MainFeed()).commit()
    }

    fun reLoadFeeds() {
        binding.bottomNavigation.selectedItemId=R.id.nav_home
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, MainFeed()).commit()
    }

    private fun reLoadUser(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, MyPage()).commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOGIN_REQUEST_CODE) {
            if (data != null) {
                accessToken.value = data.getStringExtra("get_access_token").toString()
                refreshToken.value=data.getStringExtra("get_refresh_token").toString()
                userGcn.value=data.getStringExtra("get_gcn").toString()
                editor.putString("get_refresh_token", refreshToken.value)
                editor.putString("get_gcn", userGcn.value)
                editor.apply()
                reLoadFeeds()
                reLoadUser()
            }
        }
    }

    fun startClubDetail(club: String) {
        val intent = Intent(this, ClubDetails::class.java)
        intent.putExtra("club_id",club)
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
        refreshToken.value = startShared.getString("get_refresh_token", "").toString()
        userGcn.value= startShared.getString("get_gcn","").toString()
    }

    private val showSheet=BottomSheetDialog()
    fun showMore(id:Int){
        showSheet.clubId=id
        if(!showSheet.isAdded){
            showSheet.show(supportFragmentManager,"more")
        }
    }
    fun closeSheet():Boolean{
        showSheet.dismiss()
        var start=false
        AlertDialog.Builder(
            this, R.style.myDialog
        )
            .setTitle("확인")
            .setMessage("정말 삭제하시겠습니까?")
            .setPositiveButton("예") { _, _ ->
               start=true
            }
            .setNegativeButton("아니요") { _, _ ->
                Toast.makeText(this,"취소하셨습니다",Toast.LENGTH_LONG).show()
                start=false
            }
            .show()
        return start
    }

    fun notShowMore(){
        val showSheet=NotSheetDialog()
        if(!showSheet.isAdded){
            showSheet.show(supportFragmentManager,"not more")
        }
    }

    private val chooseModify=ChooseModifyDialog()
    private val modifySheet=ModifySheet()
    private val editGit=GitSheetDialog()

    fun modifyInfo(){
        if(!chooseModify.isAdded){
            chooseModify.show(supportFragmentManager,"choose")
        }
    }

    fun disModifyInfo(){
        if(chooseModify.isAdded){
            chooseModify.dismiss()
        }
    }

    fun showModifyIntro(){
        if(!modifySheet.isAdded){
            modifySheet.show(supportFragmentManager,"introduce")
        }
    }

    fun disModifyIntro(){
        if(modifySheet.isAdded){
            modifySheet.dismiss()
        }
    }

    fun showEditGit(){
        if(!editGit.isAdded){
            editGit.show(supportFragmentManager,"git")
        }
    }

    fun disEditGit(){
        if(editGit.isAdded){
            editGit.dismiss()
        }
    }

    fun startGithub(id:String?){
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/$id"))
        startActivity(intent)
    }


    fun logOut(){
        AlertDialog.Builder(
            this, R.style.logOutDialog
        )
            .setTitle("주의")
            .setMessage("정말 로그아웃하시겠습니까?")
            .setPositiveButton("예") { _, _ ->
                showToast("로그아웃 하셨습니다")
                editor.clear().apply()
                accessToken.value=""
                reLoadFeeds()
            }
            .setNegativeButton("아니요") { _, _ ->
                showToast("취소하셨습니다")
            }
            .show()
    }

}