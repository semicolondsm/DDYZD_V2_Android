package com.semicolon.ddyzd_android.ul.activity

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.semicolon.ddyzd_android.databinding.ActivityLoginBinding
import com.semicolon.ddyzd_android.viewmodel.LoginViewModel
import com.semicolon.dsm_sdk_v1.DsmSdk

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val sharedPreference= getSharedPreferences("device", Context.MODE_PRIVATE)
        val deviceToken=sharedPreference.getString("device_token","").toString()
        super.onCreate(savedInstanceState)
        val instance= DsmSdk.instance
        instance.initSDK("e20961403e0b43009c5dc070a8245e2e","b1336493014a4cef8a480712c2be4bcf","https://semicolondsm.xyz/")
        val viewModel=LoginViewModel(instance,this,deviceToken)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        binding.vm=viewModel
        binding.loginWebView.settings.javaScriptEnabled=true
        binding.loginWebView.loadUrl("https://semicolondsm.xyz/mobile/loginslide")
        setContentView(binding.root)
    }

    fun finish(logined:Boolean,name:String,email:String,gcn:String,accessToken:String,refreshToken:String){
        intent.putExtra("get_name",name)
        intent.putExtra("get_email",email)
        intent.putExtra("get_gcn",gcn)
        intent.putExtra("get_access_token",accessToken)
        intent.putExtra("get_refresh_token",refreshToken)
        Log.d("억세스토큰",accessToken)
        intent.putExtra("logined",logined)
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
};