package com.example.hellokotlin.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellokotlin.DataBinding.SplashDataBinding
import com.example.hellokotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}