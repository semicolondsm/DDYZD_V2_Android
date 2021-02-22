package com.semicolon.ddyzd_android.ul.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.semicolon.ddyzd_android.databinding.ActivityClubDetailsBinding
import com.semicolon.ddyzd_android.ul.activity.MainActivity.Companion.refreshToken
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel
import com.semicolon.ddyzd_android.viewmodel.MainViewModel.Companion.accessToken

class ClubDetails : AppCompatActivity() {
    private val LOGIN_REQUEST = 132
    lateinit var binding : ActivityClubDetailsBinding
    lateinit var clubId:String
    lateinit var viewModel: ClubDetailsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        clubId=intent.getStringExtra("club_id").toString()
        viewModel= ClubDetailsViewModel(clubId,this)
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
                MainActivity.editor.putString("get_refresh_token", refreshToken)
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
}