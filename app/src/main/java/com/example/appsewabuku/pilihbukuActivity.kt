package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class pilihbukuActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihbuku)

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

        val btn_buku6: ImageButton = findViewById(R.id.buku6)
        btn_buku6.setOnClickListener(this)
    }

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
                val intent = Intent(this, buku2::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku3 -> {
                val intent = Intent(this, buku3::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku4 -> {
                val intent = Intent(this, buku4::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku5 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.buku6 -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

}