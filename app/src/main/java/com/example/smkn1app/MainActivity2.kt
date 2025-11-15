package com.example.smkn1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val register =findViewById<Button>(R.id.register)

        register.setOnClickListener {
            val intent = Intent (this, MainActivity3 ::class.java)
            startActivity(intent)
        }
    }
}