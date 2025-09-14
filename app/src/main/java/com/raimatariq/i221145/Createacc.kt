package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Createacc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_createacc)

        var back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener {
            var intent = Intent(this, Login1::class.java)
            startActivity(intent)
        }

    }
}