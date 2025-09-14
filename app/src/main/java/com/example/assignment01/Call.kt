package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_call)

        var decline = findViewById<RelativeLayout>(R.id.decline)

        decline.setOnClickListener {
            var intent = Intent(this, Chat::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}