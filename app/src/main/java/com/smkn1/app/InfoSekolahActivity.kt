package com.smkn1.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class InfoSekolahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_sekolah)

        val tvInfo = findViewById<TextView>(R.id.tvInfoSekolah)
        tvInfo.text = """
            Nama Sekolah: SMKN 1 Jakarta
            Alamat: Jl. Budi Utomo No. 7, Pasar Baru, Sawah Besar, Jakarta Pusat 10710
            Didirikan: 1906
            Luas Tanah: ± 16.700 m²
            Jurusan Utama: DPIB, BKP, TP, TKRO, TITL, TKJ, RPL, MM
            Ekstrakurikuler: Pramuka Penegak, Band Sekolah, Tenis Meja, dll.
            Fasilitas: Laboratorium, Bengkel Kejuruan, Gedung Bersejarah, Area Luas
        """.trimIndent()
    }
}
