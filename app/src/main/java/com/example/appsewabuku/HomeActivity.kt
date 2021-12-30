package com.example.appsewabuku



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class HomeActivity : AppCompatActivity() {
    var txtuser: EditText? = null
    var txtpass: EditText? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txtuser = findViewById<View>(R.id.user) as EditText
        txtpass = findViewById<View>(R.id.pass) as EditText

        val buttonlogin = findViewById<View>(R.id.buttonlogin) as Button


        buttonlogin.setOnClickListener {
            if (txtuser!!.text.toString() == "kelompokG" && txtpass!!.text.toString() == "123") {
                Toast.makeText(this@HomeActivity, "LOGIN BERHASIL", Toast.LENGTH_LONG).show()
                startActivity(Intent(this@HomeActivity, BerandaActivity::class.java))


            } else Toast.makeText(
                this@HomeActivity,
                "User atau Password Salah",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}

