package com.smkn1.app

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class IdentitasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas)

        // Halaman ini = PROFILE
        setupFooter("profile")
    }

    // =====================================
    // FOOTER LOGIC (dipakai semua halaman)
    // =====================================
    private fun setupFooter(active: String) {

        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navBook = findViewById<ImageView>(R.id.nav_book)
        val navProfile = findViewById<ImageView>(R.id.nav_profile)

        // Reset semua jadi hitam
        navHome.setColorFilter(getColor(R.color.black))
        navBook.setColorFilter(getColor(R.color.black))
        navProfile.setColorFilter(getColor(R.color.black))

        // Kasih warna biru ke icon yang aktif
        when (active) {
            "home" -> navHome.setColorFilter(getColor(R.color.blue))
            "book" -> navBook.setColorFilter(getColor(R.color.blue))
            "profile" -> navProfile.setColorFilter(getColor(R.color.blue))
        }
    }
}
