package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SewaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewa)

        

        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btn_selanjutnya: Button = findViewById(R.id.selanjutnya)
        btn_selanjutnya.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {

            R.id.selanjutnya -> {
                val intent = Intent(this, KonfirmasiActivity::class.java)
                startActivity(intent)
                finish()
            }


        }
    }
}