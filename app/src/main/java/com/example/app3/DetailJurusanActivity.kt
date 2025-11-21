package com.example.app3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailJurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jurusan)

        val namaJurusan = intent.getStringExtra("jurusan")
        val txtNamaJurusan = findViewById<TextView>(R.id.txtNamaJurusan)

        txtNamaJurusan.text = namaJurusan
    }
}
