package com.example.myhotel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton1 : Button = findViewById(R.id.backButton1)
        var buttonPayNow: Button = findViewById(R.id.buttonPayNow)
        var editTextFullName : EditText = findViewById(R.id.editTextFullName)
        var editTextCardNumber : EditText = findViewById(R.id.editTextCardNumber)
        buttonPayNow.setOnClickListener {
            if (editTextFullName.text.toString().isEmpty() || editTextCardNumber.text.toString().isEmpty()){
                Toast.makeText(this, "3mer kolchi anssab ", Toast.LENGTH_SHORT).show()
            }
           // else{ startActivity(Intent(this,successpay::class.java))
             ///   Toast.makeText(this, "Payment processing...", Toast.LENGTH_SHORT).show()
                // قم بتنفيذ منطق الدفع هنا}

         //   }
        }
        backButton1.setOnClickListener(){
            startActivity(Intent(this,reservation2::class.java))
        }

    }
}
