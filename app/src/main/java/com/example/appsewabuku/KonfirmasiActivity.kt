package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class KonfirmasiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val selesai = findViewById<View>(R.id.selesai) as ImageButton
        selesai.setOnClickListener(this)

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

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.selesai->{
                Toast.makeText(this@KonfirmasiActivity, "BERHASIL", Toast.LENGTH_LONG).show()
                    val intent = Intent (this,peminjamanFragment::class.java)
                    startActivity(intent)


            }
        }
    }
}