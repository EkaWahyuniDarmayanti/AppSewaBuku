package com.example.appsewabuku


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BerandaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val btn_unhas: ImageButton = findViewById(R.id.unhas)
        btn_unhas.setOnClickListener(this)

        val btn_umi: ImageButton = findViewById(R.id.umi)
        btn_umi.setOnClickListener(this)

        val btn_ugm: ImageButton = findViewById(R.id.ugm)
        btn_ugm.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.unhas -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.umi -> {
                val intent = Intent (this,ListBukuAdapter::class.java)
                startActivity(intent)
                finish()
            }

            R.id.ugm -> {
                val intent = Intent (this,ListBukuAdapter::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


}




