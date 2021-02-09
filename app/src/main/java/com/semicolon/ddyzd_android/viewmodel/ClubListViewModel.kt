package com.semicolon.ddyzd_android.viewmodel

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.Image
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.ObservableField
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
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.InputStream
import java.lang.System.load
import java.net.HttpURLConnection
import java.net.URL

class ClubListViewModel() : ViewModel() {
    lateinit var body: Array<ClubData> // 동아리 전체
    var clubimage = mutableListOf<String>() // 동아리 이미지
    var clubname = mutableListOf<String>() // 동아리 이름
    var clubexample = mutableListOf<String>() //동아리 설명
    val list = ClubList().view?.findViewById<RecyclerView>(R.id.rv_proflie)
    val adapter = BaseApi.getInstance()
    var proflieList = mutableListOf<ClubProfiles>()
    val liveData1: MutableLiveData<String> = MutableLiveData()
    var size: Int = 0
    var sub: Int = 0

    val call = adapter.clublist()
        .observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .doOnError {
            println("error")
        }
        .unsubscribeOn(Schedulers.io())
        .subscribe { result ->
            body = result
            clubListSet(body).apply {
                println(body)
            }
        }
    fun clubListSet(body: Array<ClubData>){
        size = body.size
        for(i in 0 until size){
            clubimage.add(body[i].clubimage)
            clubname.add(body[i].clubname)
            clubexample.add(body[i].clubdescription)
            proflieList.add(
                ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
            )
        }
            liveData1.value = "1"
            list?.setHasFixedSize(true)
            list?.layoutManager = LinearLayoutManager(ClubList().view?.context, LinearLayoutManager.VERTICAL,false)
            list?.adapter = ClubAdapter(clubAdapter = proflieList as ArrayList<ClubProfiles>)
    }
    val bottomNavigationView = BottomNavigationView.OnNavigationItemSelectedListener {
        println("hgfkh")
        proflieList = mutableListOf<ClubProfiles>()
        when(it.itemId){
            R.id.total -> {
                for(i in 0 until size){
                    proflieList.add(
                            ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                    )
                }
                liveData1.value = "1"
            }
            R.id.web ->{
                proflieList = mutableListOf()
                for(i in 0 until size){
                    sub = body[i].clubtag.size
                    for(j in 0 until sub){
                        if(body[i].clubtag[j] == "웹"){
                            proflieList.add(
                                    ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                            )
                        }
                    }
                }
                liveData1.value = "2"
            }
            R.id.app ->{
                proflieList = mutableListOf()
                for(i in 0 until size){
                    sub = body[i].clubtag.size
                    for(j in 0 until sub){
                        if(body[i].clubtag[j] == "앱"){
                            proflieList.add(
                                    ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                            )
                        }
                    }
                }
                liveData1.value = "3"
            }
            R.id.imbe ->{
                proflieList = mutableListOf()
                for(i in 0 until size){
                    sub = body[i].clubtag.size
                    for(j in 0 until sub){
                        if(body[i].clubtag[j] == "임베디드"){
                            proflieList.add(
                                    ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                            )
                        }
                    }
                }
                liveData1.value = "4"
            }
            R.id.guitar ->{
                proflieList = mutableListOf()
                for(i in 0 until size){
                    sub = body[i].clubtag.size
                    for(j in 0 until sub){
                        if(body[i].clubtag[j] !="앱" && body[i].clubtag[j] !="웹"&& body[i].clubtag[j] !="임베디드"){
                            proflieList.add(
                                    ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                            )
                        }
                    }
                }
                liveData1.value = "5"
            }
        }
        true
    }
}