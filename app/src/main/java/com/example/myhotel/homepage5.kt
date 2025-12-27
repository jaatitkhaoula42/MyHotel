package com.example.myhotel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class homepage5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        var btn1=findViewById<Button>(R.id.btn1)
        var btn2=findViewById<Button>(R.id.btn2)
        val intent1 = Intent(this, sittings::class.java)
        btn1.setOnClickListener(){startActivity(intent1)}
        val intent2 = Intent(this, search::class.java)
        btn2.setOnClickListener(){startActivity(intent2)}

//        val sittings=findViewById<Button>(R.id.btn1)
//        sittings.setOnClickListener(){
//
//            startActivity(Intent(this,sittings::class.java))
//        }
//        val search=findViewById<Button>(R.id.btn2)
//        search.setOnClickListener(){
//
//            startActivity(Intent(this,search::class.java))
//        }

}
}