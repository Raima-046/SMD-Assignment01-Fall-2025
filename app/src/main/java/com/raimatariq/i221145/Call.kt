package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_call)

        var decline = findViewById<RelativeLayout>(R.id.decline)

        decline.setOnClickListener {
            var intent = Intent(this, Chat::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}