package com.semicolon.ddyzd_android.ul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChattingPageBinding
import com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel
import java.util.*

class ChattingPage : AppCompatActivity() {
    var roomId = ""
    var clubImage = ""
    var clubName = ""
    var clubId = ""
    var index = 0

    //var club_section = ArrayList<String>()
    lateinit var binding: ActivityChattingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        clubId = intent.getStringExtra("chatClubId").toString()
        roomId = intent.getStringExtra("chatRoomId").toString()
        clubImage = intent.getStringExtra("chatClubImage").toString()
        clubName = intent.getStringExtra("chatClubName").toString()
        index = intent.getIntExtra("chatIndex", 0)
        //club_section = intent.getStringArrayListExtra("chatClubSection") as ArrayList<String>
        println("$roomId 이게 룸아이디")

        binding = ActivityChattingPageBinding.inflate(layoutInflater)
        val viewModel = ChattingPageViewModel(this)
        viewModel.onCreate()
        binding.vm = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)


    }

    /**
     * 배열을 받아와서 dialog 띄우는 함수
     */
    fun selectPart(items: ArrayList<String>,callback:(part:String)->Unit) {
        var selected = ""
        if (items.size > 0) {
            val array = items.toTypedArray()
            for (index in 0 until items.size) {
                array[index] = items[index]
            }
            AlertDialog.Builder(
                this, R.style.myDialog
            ).setTitle("분야선택")
                .setSingleChoiceItems(array, -1) { _, which ->
                    selected = array[which].toString()
                }
                .setPositiveButton("확인") { _, _ ->
                    if (selected.isEmpty()) {
                        Toast.makeText(this, "분야를 선택해주세요", Toast.LENGTH_SHORT).show()
                    }else{
                        callback(selected)
                    }
                }
                .setNegativeButton("취소") { _, _ ->
                    selected = ""
                }.show()

        } else {
            Toast.makeText(this, "등록된 분야가 없습니다", Toast.LENGTH_SHORT).show()
        }
    }
    /**
     * 면접일정 날짜 dialog 를 뛰워주는 함수
     */
    fun selectDate(callback:(date: Date)->Unit){

    }
}
