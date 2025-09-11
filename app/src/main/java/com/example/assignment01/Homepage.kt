package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        var chats = findViewById<ImageView>(R.id.dm)
        var dm = findViewById<ImageView>(R.id.dm)
        var user = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.userpf)
        var search = findViewById<ImageView>(R.id.search)

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
        }

        search.setOnClickListener {
            var intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
        }

    }
}