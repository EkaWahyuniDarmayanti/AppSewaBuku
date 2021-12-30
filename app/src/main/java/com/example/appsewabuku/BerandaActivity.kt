package com.example.appsewabuku


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BerandaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val buttonunhas: Button
        buttonunhas = findViewById(R.id.unhas)
        buttonunhas.setOnClickListener(this)

        val buttonumi: Button
        buttonumi = findViewById(R.id.unhas)
        buttonumi.setOnClickListener(this)

        val buttonugm: Button
        buttonugm = findViewById(R.id.unhas)
        buttonugm.setOnClickListener(this)

        val buttonpnup: Button
        buttonpnup = findViewById(R.id.unhas)
        buttonpnup.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.unhas -> {
                val moveIntentunhas = Intent(this@BerandaActivity, pilihbukuActivity::class.java)
                startActivity(moveIntentunhas)
            }

            R.id.umi -> {
                val moveintentumi = Intent(this@BerandaActivity, pilihbukuActivity::class.java)
                startActivity(moveintentumi)
            }

            R.id.ugm -> {
                var moveIntentugm = Intent(this@BerandaActivity, pilihbukuActivity::class.java)
                startActivity(moveIntentugm)
            }

            R.id.pnup -> {
                val moveIntentpnup = Intent(this@BerandaActivity, pilihbukuActivity::class.java)
                startActivity(moveIntentpnup)
            }
        }
    }
}