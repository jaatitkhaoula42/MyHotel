package com.example.myhotel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class reservation2 : AppCompatActivity() {

    private var membersCount = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val calendarView: CalendarView = findViewById(R.id.calendarView)
        val editTextEmail: EditText = findViewById(R.id.editTextEmail)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val textViewMembers: TextView = findViewById(R.id.textViewMembers)
        val spinnerRoomType: Spinner = findViewById(R.id.spinnerRoomType)
        val textViewPrice: TextView = findViewById(R.id.textViewPrice)
        val buttonTakeNow: Button = findViewById(R.id.buttonTakeNow)


        val today = System.currentTimeMillis()
        calendarView.setDate(today,true, true )


        // تقليل عدد الأعضاء
        buttonMinus.setOnClickListener {
            if (membersCount > 1) {
                membersCount--
                textViewMembers.text = membersCount.toString()
            } else {
                Toast.makeText(this, "Minimum members is 1", Toast.LENGTH_SHORT).show()
            }
        }

        // زيادة عدد الأعضاء
        buttonPlus.setOnClickListener {
            membersCount++
            textViewMembers.text = membersCount.toString()
        }


        ArrayAdapter.createFromResource(
            this,
            R.array.room_categories,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerRoomType.adapter = adapter
        }

        // التعامل مع اختيار العنصر من Spinner
        spinnerRoomType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedRoomType = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@reservation2, "Selected: $selectedRoomType", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // لا تفعل شيئًا عند عدم اختيار أي عنصر
            }
        }

        // زر الحجز
        buttonTakeNow.setOnClickListener {
            val selectedDate = calendarView.date
            val email = editTextEmail.text.toString()
            val roomCategory = spinnerRoomType.selectedItem.toString()
            val price = textViewPrice.text.toString()

            Toast.makeText(
                this,
                "MyHotel confirmed for $email  with $roomCategory at $price",
                Toast.LENGTH_SHORT
            ).show()

        }
        val test2 = findViewById<Button>(R.id.buttonTakeNow)
        test2.setOnClickListener (){
            startActivity(Intent(this, payment::class.java))
        }


    }
}
