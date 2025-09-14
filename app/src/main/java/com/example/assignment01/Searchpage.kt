package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Searchpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_searchpage)

        var chat = findViewById<LinearLayout>(R.id.gotochat)

        chat.setOnClickListener {
            var intent = Intent(this, Chat::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}