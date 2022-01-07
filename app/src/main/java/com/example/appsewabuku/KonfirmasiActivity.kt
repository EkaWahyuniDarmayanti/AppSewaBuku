package com.example.appsewabuku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

lateinit var txtview : TextView
lateinit var array1 : TextView

class KonfirmasiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val btn_selesai: ImageButton = findViewById(R.id.selesai)
        btn_selesai.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.selesai->{
                Toast.makeText(this@KonfirmasiActivity, "BERHASIL", Toast.LENGTH_LONG).show()
                    val intent = Intent (this,HistoryActivity::class.java)
                    startActivity(intent)


            }
        }
    }
}