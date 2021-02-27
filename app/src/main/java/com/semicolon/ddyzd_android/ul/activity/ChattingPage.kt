package com.semicolon.ddyzd_android.ul.activity

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
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
    fun selectPart(items: ArrayList<String>, callback: (part: String) -> Unit) {
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
                    } else {
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
    @RequiresApi(Build.VERSION_CODES.N)
    fun selectDate(callback: (date: String, place: String?) -> Unit) {
        var setDate = ""
        val cal = Calendar.getInstance()
        val nowYear = cal.get(Calendar.YEAR)
        val nowMonth = cal.get(Calendar.MONTH)
        val nowDay = cal.get(Calendar.DAY_OF_MONTH)

        val placeText= EditText(this)
        val placeDialog=AlertDialog.Builder(
            this,R.style.myDialog
        ).setTitle("면접장소입력")
            .setMessage("면접을 진행할 장소를 입력해주세요")
            .setView(placeText)
            .setPositiveButton("확인"){_,_->
                if(placeText.text.isNullOrEmpty()){
                    Toast.makeText(this,"장소를 입력해주세요",Toast.LENGTH_SHORT).show()
                }else{
                    callback(setDate,placeText.text.toString())
                }
            }
        /**
         * 시간 가져오는 dialog
         */
        val timeDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                var onTwelve=""
                if(hourOfDay>12) {
                    onTwelve = "오후"
                    hourOfDay-12
                }else{
                    onTwelve="오전"
                }
                setDate+=" $onTwelve $hourOfDay 시 $minute 분"
                placeDialog.show()
            },
            0,
            0,
            false
        )

        /**
         * 날짜 가져오는 dialog
         */
        val dateDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                setDate =
                    "$month 월${dayOfMonth}일"
                timeDialog.show()
            },
            nowYear,
            nowMonth,
            nowDay
        )
        dateDialog.show()
    }

    /**
     * 합격||불합격 통지하는 dialog
     */
    fun sendResultDialog(callback:(result:Boolean)->Unit){
        AlertDialog.Builder(this,R.style.myDialog)
            .setTitle("결과")
            .setMessage("합격 여부를 선택해주세요")
            .setPositiveButton("합격"){ _, _ ->
                Toast.makeText(this,"합격 시켰습니다",Toast.LENGTH_SHORT).show()
                callback(true)
            }
            .setNegativeButton("불합격"){_,_->
                Toast.makeText(this,"불합격 시켰습니다",Toast.LENGTH_SHORT).show()
                callback(false)
            }.show()
    }
}
