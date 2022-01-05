package com.example.appsewabuku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfragment = PengembalianFragment()
        val secondfragment =peminjamanFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firstfragment)
            commit()
        }

        val pinjam = findViewById<Button>(R.id.pinjam)

        pinjam.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstfragment)
                addToBackStack(null)
                commit()
            }
        }

        val kembali = findViewById<Button>(R.id.kembali)

        kembali.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondfragment)
                commit()
            }
        }
    }
}