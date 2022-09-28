package com.example.hellokotlin.Activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.widget.SeekBar
import android.widget.Toast
import com.example.hellokotlin.R
import com.example.hellokotlin.databinding.ActivitySplashScreenBinding
import java.util.*

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        autoProgressBar()
    }
    private fun autoProgressBar(){
        object : CountDownTimer(60000, 110) {
            override fun onTick(millisUntilFinished: Long) {
                var current : Int = binding.progressBar.progress
                binding.progressBar.progress = current + 3
                if (current == binding.progressBar.max){
                    var intent = Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            override fun onFinish() {
                Toast.makeText(applicationContext,"Tải dữ liệu thất bại",Toast.LENGTH_SHORT).show()
            }
        }.start()
    }
}