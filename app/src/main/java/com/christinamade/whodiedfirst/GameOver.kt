package com.christinamade.whodiedfirst

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameOver: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gameover)
        Log.d("Gameover ", "was called")

        var replay=findViewById<Button>(R.id.replay)
        var youScored=findViewById<TextView>(R.id.youScored)

        val totalScore=intent.getIntExtra("totalScore",0)
        youScored.text="Score: "+ totalScore.toString()

        replay.setOnClickListener {
            val intent= Intent(this, GamePlay::class.java)
            startActivity(intent)
        }

    }
}