package com.semicolon.ddyzd_android

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import rxdogtag2.RxDogTag
import java.util.concurrent.TimeUnit

object BaseApi {
    var club_id: String = ""
    val CONNECT_TIMEOUT: Long = 15
    val WRITE_TIMEOUT: Long = 15
    val READ_TIMEOUT: Long = 15
    val API_URL: String = "https://api.eungyeol.live/"
    var OKHttpClient: OkHttpClient
    var mRetrofit: Retrofit
    var KotlinRetrofitInterface: ApiService

    init {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        OKHttpClient = OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
            connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
            writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        }.build()
        mRetrofit = Retrofit.Builder().apply {
            baseUrl(API_URL)
            client(OKHttpClient)
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            addConverterFactory(GsonConverterFactory.create())
        }.build()
        KotlinRetrofitInterface = mRetrofit.create()
        RxDogTag.install()
        RxJavaPlugins.setErrorHandler { Log.d("RxError", it.toString()) }
    }

    fun getInstance(): ApiService {
        return KotlinRetrofitInterface
    }

}