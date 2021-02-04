package com.semicolon.ddyzd_android

import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BaseApi {
    val gson: Gson = GsonBuilder()
            .setLenient()
            .create()

    val BaseRetrofit = Retrofit.Builder()
            .baseUrl("https://api.eungyeol.live/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    val serverbasic: ApiService? = BaseRetrofit.create(ApiService::class.java) // severbasic 변수 사용해서 만드는 거

    var liveData: MutableLiveData<String> = MutableLiveData()
}