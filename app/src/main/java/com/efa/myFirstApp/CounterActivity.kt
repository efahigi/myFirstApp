package com.efa.myFirstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
    }
}