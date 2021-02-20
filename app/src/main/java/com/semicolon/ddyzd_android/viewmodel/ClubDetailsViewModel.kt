package com.semicolon.ddyzd_android.viewmodel

import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.model.Sub
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ClubDetailsViewModel {
    private var club_id = BaseApi.club_id // 선택한 동아리 번호
    private val adapter = BaseApi.getInstance()
    lateinit var clubid : String // 클럽 아이디
    lateinit var clubName : String // 클럽이름
    lateinit var clubTag : ArrayList<String> // 클럽태그
    lateinit var clubimage : String //클럽사진
    lateinit var backImage : String // 배너 사진
    lateinit var description : String // 클럽 설명

    lateinit var major : ArrayList<Sub>
    lateinit var closeat : String

    lateinit var name : ArrayList<String>
    lateinit var profile_image : ArrayList<String>
    lateinit var gcn : ArrayList<String>
    lateinit var git : ArrayList<String>

    val time = System.currentTimeMillis().toString()

    val callInfo = adapter.clubInfo(club_id)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
            clubid = result.clubid
            clubName = result.clubname
            clubTag = result.clubtag
            clubimage =result.clubimage
            backImage = result.backimage
            description = result.description
        }

    val callRecruitment = adapter.clubRecruit(club_id)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError{
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe{ result->
            major = result.major
            closeat = result.closeat
        }


   /* val callMamber = adapter.clubMenber(club_id)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
               
        }*/

    fun time(): String {
        val time = System.currentTimeMillis().toString() // 시간 받는거
        return time
    }
}


