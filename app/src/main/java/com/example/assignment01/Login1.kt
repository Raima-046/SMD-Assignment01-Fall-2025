package com.example.assignment01

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login1)

        var signup = findViewById<TextView>(R.id.tt5)
        var login = findViewById<TextView>(R.id.btn)

        signup.setOnClickListener{
            var intent = Intent(this, Createacc::class.java)
            startActivity(intent)
        }

        login.setOnClickListener{
            var intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }
}