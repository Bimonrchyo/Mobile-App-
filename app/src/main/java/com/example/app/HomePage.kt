package com.example.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomePage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_page, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        val list = listOf(
            Kegiatan(R.drawable.lomba, "Kegiatan Lomba 17 Agustus"),
            Kegiatan(R.drawable.pramuka, "Kejuaraan Tingkat Kota Pramuka"),
            Kegiatan(R.drawable.pendidikan, "Pendidikan Berdasarkan Arah Rasulullah"),
            Kegiatan(R.drawable.upacara, "Kegiatan Upacara SMKN 1 Jakarta")
        )

        recyclerView.adapter = KegiatanSekolah(list)

        return view
    }
}

