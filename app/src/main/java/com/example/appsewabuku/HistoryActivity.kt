package com.example.appsewabuku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        val fragment1 = peminjamanFragment();
        val fragment2 = PengembalianFragment();

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, fragment1)
            commit()
        }
        val btn1: Button = findViewById(R.id.button1)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, fragment1)
                addToBackStack(null)
                commit()
            }
        }

        val btn2: Button = findViewById(R.id.button2)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, fragment2)
                addToBackStack(null)
                commit()
            }
        }


    }


}