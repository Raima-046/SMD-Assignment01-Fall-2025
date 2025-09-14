package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_story)

        var create = findViewById<RelativeLayout>(R.id.create)

        var go = findViewById<RelativeLayout>(R.id.go)


        go.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }

        create.setOnClickListener {
            var intent = Intent(this, EditStory::class.java)
            startActivity(intent)
            finish()
        }

    }
}