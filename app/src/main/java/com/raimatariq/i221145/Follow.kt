package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Follow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_follow)

        var hilite = findViewById<ImageView>(R.id.hilite)

        var search = findViewById<ImageView>(R.id.feed)
        var post = findViewById<ImageView>(R.id.upload)
        var likes = findViewById<ImageView>(R.id.likes)
        var home = findViewById<ImageView>(R.id.home)

        hilite.setOnClickListener {
            var intent = Intent(this, Highlight::class.java)
            startActivity(intent)
        }

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
    }
}