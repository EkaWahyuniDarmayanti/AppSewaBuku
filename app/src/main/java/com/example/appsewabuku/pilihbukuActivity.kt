package com.example.appsewabuku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class pilihbukuActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<buku> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihbuku)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)
//        val back = findViewById<View>(R.id.iconback) as ImageButton
//        back.setOnClickListener(this)

        list.addAll(DataBuku.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        TODO("Not yet implemented")
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listBukuAdapter = ListBukuAdapter(list)
        rvHeroes.adapter = listBukuAdapter
    }
}