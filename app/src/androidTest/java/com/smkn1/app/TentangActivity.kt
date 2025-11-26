package com.smkn1.app

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TentangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navBook = findViewById<ImageView>(R.id.nav_book)
        val navProfile = findViewById<ImageView>(R.id.nav_profile)

        // ICON AKTIF = BUKU
        setActiveFooter()

        // footer tidak pindah halaman
        navHome.setOnClickListener {}
        navBook.setOnClickListener {}
        navProfile.setOnClickListener {}
    }

    private fun setActiveFooter() {
        val navBook = findViewById<ImageView>(R.id.nav_book)

        val dark = PorterDuffColorFilter(0x80000000.toInt(), PorterDuff.Mode.SRC_ATOP)

        navBook.colorFilter = dark     // ikon buku gelap
    }
}
