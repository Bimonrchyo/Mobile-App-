package com.example.smkn1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.text.InputType

class MainActivity3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //button back
        val back =findViewById<Button>(R.id.back)

        back.setOnClickListener {
            val intent = Intent (this, MainActivity2 ::class.java)
            startActivity(intent)

            //toggle hide&show
            var isVisible = false

            val edit4 = findViewById<EditText>(R.id.edit4)
            val toggle = findViewById<ImageView>(R.id.hintPw)

            toggle.setOnClickListener {
                if(isVisible){
                    //hide
                    edit4.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    toggle.setImageResource(R.drawable.matanutup)
                } else {
                    // show
                    edit4.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                    toggle.setImageResource(R.drawable.mata)
                }

                // cursor at the end of text
                edit4.setSelection(edit4.text.length)

                isVisible = !isVisible
            }
        }
    }
}

