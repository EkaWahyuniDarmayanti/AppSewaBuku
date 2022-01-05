package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val iconback: ImageButton = findViewById(R.id.iconback)
        iconback.setOnClickListener(this)

        val btn_sewa: Button = findViewById(R.id.toolbar)
        btn_sewa.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {

            R.id.iconback -> {
                val intent = Intent(this, pilihbukuActivity::class.java)
                startActivity(intent)
                finish()
            }

            R.id.toolbar-> {
                val intent = Intent(this, SewaActivity::class.java)
                startActivity(intent)
                finish()
            }


        }
    }
}