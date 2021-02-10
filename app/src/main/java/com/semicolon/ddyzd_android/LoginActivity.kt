package com.semicolon.ddyzd_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.semicolon.ddyzd_android.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}