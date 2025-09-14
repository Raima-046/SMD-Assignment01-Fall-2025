package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ViewOtherStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_other_story)

        var goback = findViewById<ImageView>(R.id.goback)
        var kyan = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.kyankiprofile)


        goback.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        kyan.setOnClickListener {
            var intent = Intent(this, Followed::class.java)
            startActivity(intent)
        }
    }
}