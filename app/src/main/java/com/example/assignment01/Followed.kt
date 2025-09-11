package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Followed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_followed)

        var follow = findViewById<TextView>(R.id.fol)

        follow.setOnClickListener {
            var intent = Intent(this, Follow::class.java)
            startActivity(intent)
        }
    }
}