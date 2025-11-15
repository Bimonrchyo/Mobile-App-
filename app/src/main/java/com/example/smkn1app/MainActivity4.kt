package com.example.smkn1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //button back
        val back =findViewById<Button>(R.id.back)

        back.setOnClickListener {
            val intent = Intent (this, MainActivity2 ::class.java)
            startActivity(intent)
        }
    }
}