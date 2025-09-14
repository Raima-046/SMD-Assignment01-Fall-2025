package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LikedStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_liked_story)

        var go = findViewById<ImageView>(R.id.goback)
        go.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}