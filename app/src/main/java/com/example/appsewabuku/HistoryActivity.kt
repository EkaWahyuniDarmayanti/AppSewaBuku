package com.example.appsewabuku

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class HistoryActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val fragment1 = peminjamanFragment();
        val fragment2 = PengembalianFragment();
        val btn_beranda: ImageButton = findViewById(R.id.beranda)
        btn_beranda.setOnClickListener(this)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, fragment1)
            commit()
        }
        val btn1: Button = findViewById(R.id.pinjam)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, fragment1)
                addToBackStack(null)
                commit()
            }
        }

        val btn2: Button = findViewById(R.id.kembali)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, fragment2)
                addToBackStack(null)
                commit()
            }
        }


    }

    override fun onClick(v: View?) {


            when(v?.id){
                R.id.beranda->{
                    val intent = Intent (this,BerandaActivity::class.java)
                    startActivity(intent)


                }
            }

    }


}