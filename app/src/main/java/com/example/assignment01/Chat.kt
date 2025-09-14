package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)

        var vcall = findViewById<ImageView>(R.id.vcall)
        var back = findViewById<ImageView>(R.id.goback)

        vcall.setOnClickListener {
            var intent = Intent(this, Call::class.java)
            startActivity(intent)
            onBackPressed()
        }

        back.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }
}