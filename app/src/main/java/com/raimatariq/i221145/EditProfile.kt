package com.raimatariq.i221145

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        var cancel = findViewById<TextView>(R.id.cancel)
        var done = findViewById<TextView>(R.id.done)

        cancel.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }

        done.setOnClickListener {
            var intent = Intent(this, Profile::class.java)
            startActivity(intent)
            onBackPressed()
        }
    }
}