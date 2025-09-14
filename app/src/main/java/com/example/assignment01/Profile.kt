package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        var search = findViewById<ImageView>(R.id.feed)
        var post = findViewById<ImageView>(R.id.upload)
        var likes = findViewById<ImageView>(R.id.likes)
        var home = findViewById<ImageView>(R.id.home)


        var editprof = findViewById<TextView>(R.id.btn)

        search.setOnClickListener {
            var intent = Intent(this, Feed::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }

        post.setOnClickListener {
            var intent = Intent(this, CreatePost::class.java)
            startActivity(intent)
        }

        likes.setOnClickListener {
            var intent = Intent(this, LikesFollowing::class.java)
            startActivity(intent)
        }

        editprof.setOnClickListener {
            var intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }

        fun onBackPressed() {
            finish()   // Profile close hoga aur back stack me jo previous screen hai (Homepage) wo aa jayegi
        }
    }


}