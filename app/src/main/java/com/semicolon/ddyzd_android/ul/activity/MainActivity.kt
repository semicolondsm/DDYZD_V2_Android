package com.semicolon.ddyzd_android.ul.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.ViewModels.feedViewModel
import com.semicolon.ddyzd_android.ViewModels.myPageViewModel
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
    private val UPDATE_REQUEST_CODE=47
    val viewModel = MainViewModel(this)
    lateinit var binding: ActivityMainBinding

    companion object {
        lateinit var startShared: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        initSharedPreference()
        ActivityNavigator.mainActivity = this
        initViewModels()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setTheme(R.style.AppTheme)
        checkUpdate()
        super.onCreate(savedInstanceState)
        binding =
            ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        setContentView(binding.root)
        createFeeds()
        binding.mainBtmNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, MainFeed()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.nav_club -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, ClubList()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_my -> {
                    myPageViewModel.onCreate()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, MyPage()).commitAllowingStateLoss()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }

    }

    /**
     * 업데이트 확인하는 함수
     */
    private fun checkUpdate(){
        val appUpdateManager=AppUpdateManagerFactory.create(applicationContext)
        val appUpdateInfoTask=appUpdateManager.appUpdateInfo
        appUpdateInfoTask.addOnSuccessListener { appUpdateInfo->
            if(appUpdateInfo.updateAvailability()==UpdateAvailability.UPDATE_AVAILABLE&&appUpdateInfo.isUpdateTypeAllowed(
                    AppUpdateType.IMMEDIATE)){
                appUpdateManager.startUpdateFlowForResult(appUpdateInfo,AppUpdateType.IMMEDIATE,this,UPDATE_REQUEST_CODE)
            }
        }
    }

    /**
     * fcm click check
     */
    private fun checkFcm(){
        if(!intent.getStringExtra("chatRoomId").isNullOrEmpty()){
            val roomId=intent.getStringExtra("chatRoomId")
            val title = intent.getStringExtra("chatClubName")
            val userType = intent.getStringExtra("userType")
            val intent=Intent(this,ChattingPage::class.java)
            intent.putExtra("chatRoomId", roomId)
            intent.putExtra("chatClubName", title)
            intent.putExtra("fcmClicked", true)
            if (userType == "C" || userType == "H1" || userType == "H4") {
                intent.putExtra("chatIndex", 1)
            }
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
    }
    private fun initViewModels() {
        feedViewModel = MainFeedViewModel(this)
        myPageViewModel = MyPageViewModel(this)
    }

    override fun onResume() {
        super.onResume()
        checkFcm()
        viewModel.onCreate()
    }

    fun createFeeds() {
        binding.mainBtmNav.selectedItemId = R.id.nav_home
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, MainFeed()).commitAllowingStateLoss()
    }

    fun reLoadFeeds() {
        feedViewModel.onCreate()
    }

    private fun reLoadUser() {
        myPageViewModel.onCreate()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOGIN_REQUEST_CODE) {
            if (data != null) {
                accessToken.value = data.getStringExtra("get_access_token").toString()
                refreshToken.value = data.getStringExtra("get_refresh_token").toString()
                userGcn.value = data.getStringExtra("get_gcn").toString()
                editor.putString("get_refresh_token", refreshToken.value)
                editor.putString("get_gcn", userGcn.value)
                editor.apply()
                if (data.getBooleanExtra("logined", false)) {
                    reLoadFeeds()
                    reLoadUser()
                }else{
                    createFeeds()
                }
            }
        }
    }

    fun startClubDetail(club: String) {
        val intent = Intent(this, ClubDetails::class.java)
        intent.putExtra("club_id", club)
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
        userGcn.value = startShared.getString("get_gcn", "").toString()
    }

    private val showSheet = BottomSheetDialog()
    fun showMore(id: Int) {
        showSheet.clubId = id
        if (!showSheet.isAdded) {
            showSheet.show(supportFragmentManager, "more")
        }
    }

    fun closeSheet(callback:(result:Boolean)->Unit){
        showSheet.dismiss()
        AlertDialog.Builder(
            this, R.style.myDialog
        )
            .setTitle("확인")
            .setMessage("정말 삭제하시겠습니까?")
            .setPositiveButton("예") { _, _ ->
                callback(true)
            }
            .setNegativeButton("아니요") { _, _ ->
                Toast.makeText(this, "취소하셨습니다", Toast.LENGTH_LONG).show()
                callback(false)
            }.show()
    }

    fun notShowMore() {
        val showSheet = NotSheetDialog()
        if (!showSheet.isAdded) {
            showSheet.show(supportFragmentManager, "not more")
        }
    }

    private val chooseModify = ChooseModifyDialog()
    private val modifySheet = ModifySheet()
    private val editGit = GitSheetDialog()

    fun modifyInfo() {
        if (!chooseModify.isAdded) {
            chooseModify.show(supportFragmentManager, "choose")
        }
    }

    fun disModifyInfo() {
        if (chooseModify.isAdded) {
            chooseModify.dismiss()
        }
    }

    fun showModifyIntro() {
        if (!modifySheet.isAdded) {
            modifySheet.show(supportFragmentManager, "introduce")
        }
    }

    fun disModifyIntro() {
        if (modifySheet.isAdded) {
            modifySheet.dismiss()
        }
    }

    fun showEditGit() {
        if (!editGit.isAdded) {
            editGit.show(supportFragmentManager, "git")
        }
    }

    fun disEditGit() {
        if (editGit.isAdded) {
            editGit.dismiss()
        }
    }

    fun startGithub(id: String?) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/$id"))
        startActivity(intent)
    }


    fun logOut() {
        AlertDialog.Builder(
            this, R.style.logOutDialog
        )
            .setTitle("주의")
            .setMessage("정말 로그아웃하시겠습니까?")
            .setPositiveButton("예") { _, _ ->
                showToast("로그아웃 하셨습니다")
                editor.clear().apply()
                accessToken.value = null
                userGcn.value = null
                refreshToken.value = null
                logOutViewModel()
            }
            .setNegativeButton("아니요") { _, _ ->
                showToast("취소하셨습니다")
            }
            .show()
    }

    private fun logOutViewModel() {
        reLoadFeeds()
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, MainFeed()).commitAllowingStateLoss()
        binding.mainBtmNav.selectedItemId = R.id.nav_home
        myPageViewModel.logOut()
    }

}