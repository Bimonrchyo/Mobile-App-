package com.smkn1.app

import android.content.Intent
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TentangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)   // XML kamu

        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navBook = findViewById<ImageView>(R.id.nav_book)
        val navProfile = findViewById<ImageView>(R.id.nav_profile)

        // tombol yang aktif adalah "book"
        setActiveFooter("book")

        // HOME
        navHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(0, 0)
        }

        // BOOK (halaman aktif)
        navBook.setOnClickListener {
            // gak pindah halaman
        }

        // PROFILE
        navProfile.setOnClickListener {
            startActivity(Intent(this, InfoSekolahActivity::class.java))
            overridePendingTransition(0, 0)
        }
    }

    private fun setActiveFooter(active: String) {

        val home = findViewById<ImageView>(R.id.nav_home)
        val book = findViewById<ImageView>(R.id.nav_book)
        val profile = findViewById<ImageView>(R.id.nav_profile)

        home.clearColorFilter()
        book.clearColorFilter()
        profile.clearColorFilter()

        // efek gelap
        val darken = PorterDuffColorFilter(0x80000000.toInt(), PorterDuff.Mode.SRC_ATOP)

        when (active) {
            "home" -> home.colorFilter = darken
            "book" -> book.colorFilter = darken
            "profile" -> profile.colorFilter = darken
        }
    }
}
