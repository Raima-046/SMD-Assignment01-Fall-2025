package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feed)

        var search = findViewById<EditText>(R.id.search)
        var post = findViewById<ImageView>(R.id.upload)
        var home = findViewById<ImageView>(R.id.home)
        var likes = findViewById<ImageView>(R.id.likes)
        var prof = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)

        search.setOnClickListener {
            var intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
            finish()
        }

        post.setOnClickListener {
            var intent = Intent(this, CreatePost::class.java)
            startActivity(intent)
            onBackPressed()
        }

        home.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            onBackPressed() //profile del ho jaye from stack or khali homepage display ho
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
    }
}