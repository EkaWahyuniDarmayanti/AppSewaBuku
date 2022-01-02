package com.example.appsewabuku



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager


class HomeActivity : AppCompatActivity(), View.OnClickListener {



    @Override
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val buttonlogin = findViewById<View>(R.id.buttonlogin) as Button
        buttonlogin.setOnClickListener(this)

    }
        private fun validate(): Boolean {
            var txtuser = findViewById<View>(R.id.user) as EditText
            var txtpass = findViewById<View>(R.id.pass) as EditText
            if (txtuser.text.toString().isEmpty()) {
                txtuser.error = "Username Tidak Boleh Kosong"
                return false
            } else if (txtpass.text.toString().isEmpty()) {
                txtpass.error = "Password Tidak Boleh Kosong"
                return false

            }else if (txtuser!!.text.toString() == "kelompokG" && txtpass!!.text.toString() == "123"){
                Toast.makeText(this@HomeActivity, "LOGIN BERHASIL", Toast.LENGTH_LONG).show()
                return true
            }else{
                Toast.makeText(this@HomeActivity, "user / password salah", Toast.LENGTH_LONG).show()
                return false
            }

        }

        override fun onClick(v: View?) {
            when(v?.id){
                R.id.buttonlogin->{
                    if(validate()){
                        val intent = Intent (this,BerandaActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }






//
 }



