package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        var cancel = findViewById<TextView>(R.id.cancel)
        var done = findViewById<TextView>(R.id.done)

        cancel.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }

        done.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}