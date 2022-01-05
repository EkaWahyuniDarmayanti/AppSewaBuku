package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class pilihbukuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buku: RecyclerView
    private val list = ArrayList<buku>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihbuku)

        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        buku = findViewById(R.id.item_nama_buku)
//        buku.setHasFixedSize(true)


        val iconback: ImageButton = findViewById(R.id.iconback)
        iconback.setOnClickListener(this)

        val btn_buku1: ImageButton = findViewById(R.id.buku1)
        btn_buku1.setOnClickListener(this)

        val btn_buku2: ImageButton = findViewById(R.id.buku2)
        btn_buku2.setOnClickListener(this)

        val btn_buku3: ImageButton = findViewById(R.id.buku3)
        btn_buku3.setOnClickListener(this)

        val btn_buku4: ImageButton = findViewById(R.id.buku4)
        btn_buku4.setOnClickListener(this)

        val btn_buku5: ImageButton = findViewById(R.id.buku5)
        btn_buku5.setOnClickListener(this)

    }

//    private fun showRecyclerView(){
//        buku.layoutManager = LinearLayoutManager(this)
//        val listBukuAdapter = ListBukuAdapter(this)
//        buku.adapter = listBukuAdapter
//    }
//
//    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
//    }

    override fun onClick(v: View) {
        when (v.id) {

            R.id.iconback -> {
                val intent = Intent(this, BerandaActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku1 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku2 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku3 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku4 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku5 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

}