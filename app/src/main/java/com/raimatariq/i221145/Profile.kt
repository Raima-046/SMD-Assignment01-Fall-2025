package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

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
            onBackPressed()
        }

        home.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            onBackPressed()
        }

        post.setOnClickListener {
            var intent = Intent(this, CreatePost::class.java)
            startActivity(intent)
            onBackPressed()
        }

        likes.setOnClickListener {
            var intent = Intent(this, LikesFollowing::class.java)
            startActivity(intent)
            onBackPressed()
        }

        editprof.setOnClickListener {
            var intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
            onBackPressed()
        }

    }


}