package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class BerandaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
        val iconback: ImageButton = findViewById(R.id.iconback)
        iconback.setOnClickListener(this)

        val btn_unhas: ImageButton = findViewById(R.id.unhas)
        btn_unhas.setOnClickListener(this)

        val btn_umi: ImageButton = findViewById(R.id.umi)
        btn_umi.setOnClickListener(this)

        val btn_ugm: ImageButton = findViewById(R.id.ugm)
        btn_ugm.setOnClickListener(this)

        val btn_pnup: ImageButton = findViewById(R.id.pnup)
        btn_pnup.setOnClickListener(this)

        val btn_ub: ImageButton = findViewById(R.id.ub)
        btn_ub.setOnClickListener(this)

        val btn_unpad: ImageButton = findViewById(R.id.unpad)
        btn_unpad.setOnClickListener(this)

        val btn_bosowa: ImageButton = findViewById(R.id.bosowa)
        btn_bosowa.setOnClickListener(this)

        val btn_unm: ImageButton = findViewById(R.id.unm)
        btn_unm.setOnClickListener(this)

        val btn_ui: ImageButton = findViewById(R.id.ui)
        btn_ui.setOnClickListener(this)

        val btn_itb: ImageButton = findViewById(R.id.itb)
        btn_itb.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iconback -> {
                val intent = Intent(this, pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.unhas -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.umi -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.ugm -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.pnup -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.unpad -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.ub -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.bosowa -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.unm -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.ui -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.itb -> {
                val intent = Intent (this,pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


}




