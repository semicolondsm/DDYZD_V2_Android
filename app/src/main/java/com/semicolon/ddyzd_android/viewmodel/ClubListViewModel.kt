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
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.InputStream
import java.lang.System.load
import java.net.HttpURLConnection
import java.net.URL

class ClubListViewModel(mainActivity: MainActivity.mainact) : ViewModel() {
    lateinit var body : ArrayList<ClubData> // 동아리 전체
    var clubimage = mutableListOf<String>() // 동아리 이미지
    var clubname = mutableListOf<String>() // 동아리 이름
    var clubexample = mutableListOf<String>() //동아리 설명
    val retro = BaseApi.serverbasic?.clublist()
    var proflieList = mutableListOf<ClubProfiles>()
    val liveData1 : MutableLiveData<String> = MutableLiveData()
    // val view =Fragment1().view
    val list = ClubList().view?.findViewById<RecyclerView>(R.id.rv_proflie)
    //val context = Fragment1().context
    var size : Int = 0
    var sub : Int = 0
    val a = retro?.enqueue(object : Callback<ArrayList<ClubData>> {
        override fun onFailure(call: Call<ArrayList<ClubData>>, t: Throwable) {
            t.printStackTrace()
        }
        override fun onResponse(call: Call<ArrayList<ClubData>>, response: Response<ArrayList<ClubData>>) {


            body = response.body()!!
            println(body)
            size = body.size
            for(i in 0 until size){
                clubimage.add(body[i].clubimage)
                clubname.add(body[i].clubname)
                clubexample.add(body[i].clubdescription)
                proflieList.add(
                        ClubProfiles(R.drawable.ic_launcher_background, body[i].clubname, body[i].clubdescription)
                )
            }
            println("${proflieList},가나다라마바").apply {
                liveData1.value = "1"
                list?.setHasFixedSize(true)
                list?.layoutManager = LinearLayoutManager(ClubList().view?.context, LinearLayoutManager.VERTICAL,false)
                list?.adapter = ClubAdapter(clubAdapter = proflieList as ArrayList<ClubProfiles>)
            }
        }
    })

    val ch = ObservableField("바꾸기!")
    fun btn(){
        //val a = view?.findViewById<Button>(R.id.btn1)
        //view?.findViewById<Button>(R.id.btn1)
        ch.set("바뀌나")
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