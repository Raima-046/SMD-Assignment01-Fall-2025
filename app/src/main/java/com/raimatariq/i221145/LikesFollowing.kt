package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LikesFollowing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_likes_following)

        var you = findViewById<RelativeLayout>(R.id.you)
        var search = findViewById<ImageView>(R.id.feed)
        var post = findViewById<ImageView>(R.id.upload)
        var home = findViewById<ImageView>(R.id.home)
        var prof = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)

        you.setOnClickListener {
            var intent = Intent(this, LikedUser::class.java)
            startActivity(intent)
        }

        search.setOnClickListener {
            var intent = Intent(this, Feed::class.java)
            startActivity(intent)
        }

        post.setOnClickListener {
            var intent = Intent(this, CreatePost::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }

        prof.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            finish()
        }
    }
}