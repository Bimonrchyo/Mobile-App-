package com.example.app3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.selectedItemId = R.id.nav_home

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.nav_home -> true

                R.id.nav_jurusan -> {
                    startActivity(Intent(this, JurusanActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }

                R.id.nav_profil -> {
                    startActivity(Intent(this, ProfilActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }

                else -> false
            }
        }
    }
}
