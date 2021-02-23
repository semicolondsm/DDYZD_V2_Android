package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.semicolon.ddyzd_android.ActivityNavigator
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.ul.fragment.*
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.refreshToken
import com.semicolon.ddyzd_android.viewmodel.UserInfoViewModel

class ClubDetails : AppCompatActivity() {
    private val LOGIN_REQUEST = 132
    lateinit var binding : ActivityClubDetailsBinding
    lateinit var clubId:String
    lateinit var viewModel: ClubDetailsViewModel
    lateinit var  showSheet:BottomClubSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityNavigator.clubDetailActivity=this
        clubId=intent.getStringExtra("club_id").toString()
        viewModel= ClubDetailsViewModel(clubId,this)
        showSheet= BottomClubSheetDialog()
        viewModel.onCreate()
        binding  = ActivityClubDetailsBinding.inflate(layoutInflater)
        binding.vm = viewModel
        binding.lifecycleOwner=this
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LOGIN_REQUEST) {
            if (data != null) {
                accessToken.value = data.getStringExtra("get_access_token").toString()
                refreshToken.value=data.getStringExtra("get_refresh_token")
                MainViewModel.userGcn.value=data.getStringExtra("get_gcn").toString()
                MainActivity.editor.putString("get_refresh_token", refreshToken.value)
                MainActivity.editor.putString("get_gcn", MainViewModel.userGcn.value)
                MainActivity.editor.apply()
                viewModel.onCreate()
            }
        }
    }

    fun startLogin() {
        Toast.makeText(this,"로그인이 필요합니다",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, LoginActivity::class.java)
        startActivityForResult(intent, LOGIN_REQUEST)
    }

    fun startChatting(roomId:String){
        val intent=Intent(this,ChattingPage::class.java)
        intent.putExtra("chatClubId",clubId)
        intent.putExtra("chatClubImage", viewModel.clubDetail.value?.clubimage)
        intent.putExtra("chatClubName", viewModel.clubDetail.value?.clubname)
        intent.putExtra("chatRoomId",roomId)
        startActivity(intent)
    }

    fun showToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    fun makeFeed(clubName:String,clubId:String){
        AlertDialog.Builder(
            this, R.style.myDialog
        )
            .setTitle("확인")
            .setMessage("$clubName 의 동아리원이 맞습니까?")
            .setPositiveButton("예") { _, _ ->
                val intent=Intent(this,AddFeedActivity::class.java)
                intent.putExtra("club_id",clubId)
                startActivity(intent)
            }
            .setNegativeButton("아니요") { _, _ ->
                Toast.makeText(this,"피드는 동아리원만 생성할 수 있습니다",Toast.LENGTH_LONG).show()
            }
            .show()
    }

    //bottom sheet
    fun showMore(id:Int){
        showSheet.clubId=id
        showSheet.show(supportFragmentManager,"more")
    }
    fun closeSheet(){
        showSheet.dismiss()
    }

    fun notShowMore(){
        val showSheet= NotSheetDialog()
        showSheet.show(supportFragmentManager,"not more")
    }

    fun startClubDetail(id:String){
        val intent=Intent(this,ClubDetails::class.java)
        intent.putExtra("club_id",id)
        startActivity(intent)
        finish()
    }

    fun showUserInfo(gcn:String){
        val userInfo=UserInfo()
        userInfo.gcn=gcn
        supportFragmentManager.beginTransaction()
            .replace(R.id.club_container, userInfo,"user_fragment").commit()
    }

    fun closeUser(){
        val fragment=supportFragmentManager.findFragmentByTag("user_fragment")
        if (fragment != null) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
    }

    fun startGithub(id:String?){
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/$id"))
        startActivity(intent)
    }
}