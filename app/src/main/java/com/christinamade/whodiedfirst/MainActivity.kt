package com.christinamade.whodiedfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startButton=findViewById<Button>(R.id.startGame)
        startButton.setOnClickListener {
            val intent= Intent(this, GamePlay::class.java)
            startActivity(intent)
        }
    }
}