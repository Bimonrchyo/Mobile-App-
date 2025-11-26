package com.smkn1.app

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class IdentitasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas)   // <--- ganti ke nama XML kamu

        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navBook = findViewById<ImageView>(R.id.nav_book)
        val navProfile = findViewById<ImageView>(R.id.nav_profile)

        // ================= ICON YANG AKTIF =================
        setActiveFooter()

        // ================= FOOTER TIDAK PINDAH HALAMAN =================
        navHome.setOnClickListener { /* tidak pindah */ }
        navBook.setOnClickListener { /* tidak pindah */ }
        navProfile.setOnClickListener { /* tidak pindah */ }

    }

    // ======================================================
    //  Fungsi untuk menggelapkan icon profile sebagai aktif
    // ======================================================
    private fun setActiveFooter() {

        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navBook = findViewById<ImageView>(R.id.nav_book)
        val navProfile = findViewById<ImageView>(R.id.nav_profile)

        // reset semua
        navHome.clearColorFilter()
        navBook.clearColorFilter()
        navProfile.clearColorFilter()

        // warna gelap (50%)
        val darken = PorterDuffColorFilter(0x80000000.toInt(), PorterDuff.Mode.SRC_ATOP)

        // aktif = profile
        navProfile.colorFilter = darken
    }
}
