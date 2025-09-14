package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LikedUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_liked_user)

        var foll = findViewById<RelativeLayout>(R.id.foll)
        var search = findViewById<ImageView>(R.id.feed)
        var post = findViewById<ImageView>(R.id.upload)
        var home = findViewById<ImageView>(R.id.home)
        var prof = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)

        foll.setOnClickListener {
            var intent = Intent(this, LikesFollowing::class.java)
            startActivity(intent)
            onBackPressed()
        }

        search.setOnClickListener {
            var intent = Intent(this, Feed::class.java)
            startActivity(intent)
            onBackPressed()
        }

        post.setOnClickListener {
            var intent = Intent(this, CreatePost::class.java)
            startActivity(intent)
            onBackPressed()
        }

        home.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            onBackPressed()

        }

        prof.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}