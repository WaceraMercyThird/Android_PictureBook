package dev.waceramercythird.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AnimalActivity : AppCompatActivity() {
    lateinit var btnPrevious4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        btnPrevious4 = findViewById(R.id.btnPrevious4)


        btnPrevious4.setOnClickListener {
            val intent = Intent(this, CarActivity2::class.java)
            startActivity(intent)
        }


    }
}