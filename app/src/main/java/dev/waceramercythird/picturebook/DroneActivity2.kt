package dev.waceramercythird.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DroneActivity2 : AppCompatActivity() {
    lateinit var btnPrevious3: Button
    lateinit var btnNext5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drone2)
        btnPrevious3 = findViewById(R.id.btnPrevious4)
        btnNext5 = findViewById(R.id.btnNext5)

        btnPrevious3.setOnClickListener {
            val intent = Intent(this, FashionActivity2::class.java)
            startActivity(intent)
        }

        btnNext5.setOnClickListener {
            val intent = Intent(this, CarActivity2::class.java)
            startActivity(intent)
        }
    }
}