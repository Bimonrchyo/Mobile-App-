package com.example.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Kegiatan(val image: Int, val title: String)

class KegiatanSekolah(private val list: List<Kegiatan>) :
    RecyclerView.Adapter<KegiatanSekolah.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.imageKegiatan)
        val title: TextView = view.findViewById(R.id.textKegiatan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.kegiatan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kegiatan = list[position]
        holder.image.setImageResource(kegiatan.image)
        holder.title.text = kegiatan.title
    }

    override fun getItemCount() = list.size
}

