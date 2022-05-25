package dev.waceramercythird.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FashionActivity2 : AppCompatActivity() {
    lateinit var btnPrevious2: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fashion2)
        btnPrevious2 = findViewById(R.id.btnPrevious4)
        btnNext3 = findViewById(R.id.btnNext5)

        btnPrevious2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnNext3.setOnClickListener {
            val intent = Intent(this, DroneActivity2::class.java)
            startActivity(intent)
}
}}









