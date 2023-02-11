package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Main Activity","Insider Create...")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "Insider Start...")
    }
}