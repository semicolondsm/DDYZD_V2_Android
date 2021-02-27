package com.semicolon.ddyzd_android.viewmodel

import android.annotation.SuppressLint
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ClubAdapter
import com.semicolon.ddyzd_android.model.ClubData
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.ul.fragment.ClubList
import io.reactivex.schedulers.Schedulers

class ClubListViewModel(private val navigator: MainActivity) : ViewModel() {
    lateinit var body: Array<ClubData> // 동아리 전체
    var clubimage = mutableListOf<String>() // 동아리 이미지
    var clubname = mutableListOf<String>() // 동아리 이름
    var clubexample = mutableListOf<String>() //동아리 설명
    val list = ClubList().view?.findViewById<RecyclerView>(R.id.rv_proflie)
    private val adapter = BaseApi.getInstance() // api 연결시 사용
    var proflieList = mutableListOf<ClubProfiles>() // 리스트 뷰에 들어갈 항목
    val liveData1: MutableLiveData<String> = MutableLiveData() // 전공 분야 클릭시 바뀜
    val isEmpty = MutableLiveData<Int>(View.INVISIBLE)
    var size: Int = 0 // 리스트의 갯수
    var sub: Int = 0 // 각 동아리의 전공 갯수
    init {
        readClubList()
    }
    @SuppressLint("CheckResult")
    private fun readClubList(){
        adapter.clublist()
            .observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (it.isSuccessful) {
                    isEmpty.value = View.INVISIBLE
                    if(it.body()!=null){
                        isEmpty.value = View.INVISIBLE
                        body = it.body()!!
                        clubListSet(body)
                    }else{
                        isEmpty.value = View.VISIBLE
                    }

                } else {
                    isEmpty.value = View.VISIBLE
                }

            }, {
                isEmpty.value = View.VISIBLE
            })
    }
    private fun clubListSet(body: Array<ClubData>) {
        size = body.size
        for (i in 0 until size) {
            clubimage.add(body[i].clubimage)
            clubname.add(body[i].clubname)
            clubexample.add(body[i].clubdescription)
            proflieList.add(
                ClubProfiles(
                    body[i].clubimage,
                    body[i].clubname,
                    body[i].clubdescription,
                    body[i].clubid,
                    body[i].backimage
                )
            )
        }
        liveData1.value = "1"
        list?.setHasFixedSize(true)
        list?.layoutManager = LinearLayoutManager(
            ClubList().view?.context,
            LinearLayoutManager.VERTICAL,
            false
        )
        list?.adapter = ClubAdapter(
            clubAdapter = proflieList as ArrayList<ClubProfiles>, viewModel = this
        )
    }
    fun changeSelcted(id:Int){
        when (id) {
            0 -> {
                for (i in 0 until size) {
                    proflieList.add(
                        ClubProfiles(
                            body[i].clubimage,
                            body[i].clubname,
                            body[i].clubdescription,
                            body[i].clubid,
                            body[i].backimage
                        )
                    )
                }
                liveData1.value = "1"
            }
            1 -> {
                proflieList = mutableListOf()
                for (i in 0 until size) {
                    sub = body[i].clubtag.size
                    for (j in 0 until sub) {
                        if (body[i].clubtag[j] == "웹") {
                            proflieList.add(
                                ClubProfiles(
                                    body[i].clubimage,
                                    body[i].clubname,
                                    body[i].clubdescription,
                                    body[i].clubid,
                                    body[i].backimage
                                )
                            )
                        }
                    }
                }
                liveData1.value = "2"
            }
            2 -> {
                proflieList = mutableListOf()
                for (i in 0 until size) {
                    sub = body[i].clubtag.size
                    for (j in 0 until sub) {
                        if (body[i].clubtag[j] == "앱") {
                            proflieList.add(
                                ClubProfiles(
                                    body[i].clubimage,
                                    body[i].clubname,
                                    body[i].clubdescription,
                                    body[i].clubid,
                                    body[i].backimage
                                )
                            )
                        }
                    }
                }
                liveData1.value = "3"
            }
            3-> {
                proflieList = mutableListOf()
                for (i in 0 until size) {
                    sub = body[i].clubtag.size
                    for (j in 0 until sub) {
                        if (body[i].clubtag[j] == "임베디드") {
                            proflieList.add(
                                ClubProfiles(
                                    body[i].clubimage,
                                    body[i].clubname,
                                    body[i].clubdescription,
                                    body[i].clubid,
                                    body[i].backimage
                                )
                            )
                        }
                    }
                }
                liveData1.value = "4"
            }
            4 -> {
                proflieList = mutableListOf()
                for (i in 0 until size) {
                    sub = body[i].clubtag.size
                    for (j in 0 until sub) {
                        if (body[i].clubtag[j] != "앱" && body[i].clubtag[j] != "웹" && body[i].clubtag[j] != "임베디드") {
                            proflieList.add(
                                ClubProfiles(
                                    body[i].clubimage,
                                    body[i].clubname,
                                    body[i].clubdescription,
                                    body[i].clubid,
                                    body[i].backimage
                                )
                            )
                        }
                    }
                }
                liveData1.value = "5"
            }
        }
    }

    fun onDetailClicked(club:ClubProfiles){
        navigator.startClubDetail(club.club_id)
    }
}