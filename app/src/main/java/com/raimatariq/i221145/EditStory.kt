package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EditStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_story)

        var go = findViewById<RelativeLayout>(R.id.go)
        var cancel = findViewById<ImageView>(R.id.cancel)


        cancel.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }

        go.setOnClickListener {
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}