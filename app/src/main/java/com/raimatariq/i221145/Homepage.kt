package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        var chats = findViewById<ImageView>(R.id.dm)
        var dm = findViewById<ImageView>(R.id.dm)
        var user = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)

        var search = findViewById<ImageView>(R.id.gotofeed)
        var post = findViewById<ImageView>(R.id.upload)
        var likes = findViewById<ImageView>(R.id.likes)
        var prof = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)

        var story = findViewById<ImageView>(R.id.story)
        var viewstr = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.viewstr)
        var viewkier = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.viewkier)
        chats.setOnClickListener{
            var intent = Intent(this, Chat::class.java)
            startActivity(intent)
        }

        dm.setOnClickListener {
            var intent = Intent(this, Dms::class.java)
            startActivity(intent)
        }

        user.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
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

        likes.setOnClickListener {
            var intent = Intent(this, LikesFollowing::class.java)
            startActivity(intent)
            onBackPressed()
        }

        prof.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }

        story.setOnClickListener {
            var intent = Intent(this, CreateStory::class.java)
            startActivity(intent)
            onBackPressed()
        }

        viewstr.setOnClickListener {
            var intent = Intent(this, LikedStory::class.java)
            startActivity(intent)
        }

        viewkier.setOnClickListener {
            var intent = Intent(this, ViewOtherStory::class.java)
            startActivity(intent)
        }
    }
}