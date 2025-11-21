package com.example.app3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class JurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jurusan)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)


        bottomNav.selectedItemId = R.id.nav_jurusan

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }

                R.id.nav_jurusan -> true  // tetap di halaman ini

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
