package com.example.myhotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class inscription4 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var verificationId: String
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val otpbtn = findViewById<Button>(R.id.otpbtn)
        otpbtn.setOnClickListener(){

            startActivity(Intent (this,homepage5::class.java))
        }
        val test = findViewById<LinearLayout>(R.id.facebtn)
        test.setOnClickListener (){
            startActivity(Intent(this, reservation1::class.java))
        }

    }
}