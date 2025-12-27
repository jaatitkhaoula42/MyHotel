package com.example.myhotel

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Enable edge-to-edge layout
        setContentView(R.layout.activity_main1)

        // Set padding for system bars (status bar, navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Delay the transition to Welcomepage
        val delay: Long = 2000  // 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, welcomepage2::class.java))
            finish()  // Finish MainActivity so user can't go back
        }, delay)
    }
}
