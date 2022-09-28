package com.example.eva01_iot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_new.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivityDos::class.java
                )
            )
        }

        txt_Dispen1.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivityTres::class.java
                )
            )
        }

        txt_Dispen2.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivityCuatro::class.java
                )
            )
        }
    }
}