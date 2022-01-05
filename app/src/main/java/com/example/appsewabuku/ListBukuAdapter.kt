package com.example.appsewabuku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appsewabuku.DataBuku.listData

abstract class ListBukuAdapter(private val listHero: pilihbukuActivity) : RecyclerView.Adapter<ListBukuAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_nama_buku)
        var tvDetail: TextView = itemView.findViewById(R.id.item_deks_buku)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

//    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//
//       val buku = listHero[position]
//        Glide.with(holder.itemView.context)
//            .load(buku.photo)
//            .apply(RequestOptions())
//            .into(holder.imgPhoto)
//        holder.tvName.text = buku.name
//        holder.tvDetail.text = buku.detail
//
//        holder.itemView.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "kamu memilih" + listHero[holder.absoluteAdapterPosition].name, Toast.LENGTH_LONG).show()
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return listData.size
//
//    }


}