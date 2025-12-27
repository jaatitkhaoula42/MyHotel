package com.example.myhotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reservation1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reservation1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // زر الرجوع
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            // الرجوع إلى الواجهة السابقة
            finish()
        }
        // زر المتابعة
        val continueButton: Button = findViewById(R.id.continueButton)
        continueButton.setOnClickListener {
            // الانتقال إلى الواجهة التالية
            val intent = Intent(this, reservation2::class.java)
            startActivity(intent)
        }




    }
}
