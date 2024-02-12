package com.christinamade.whodiedfirst

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class GamePlay:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)
        var top=findViewById<TextView>(R.id.TopCeleb)
        var bottom=findViewById<TextView>(R.id.BottomCeleb)
        var earlier=findViewById<Button>(R.id.earlier)
        var later=findViewById<Button>(R.id.later)
        var totalScore=0
        var score=findViewById<TextView>(R.id.score)

        val celebrityManager=CelebrityManager()
        var celebrity1 = celebrityManager.pickRandomCelebrity()
        var celebrity2=celebrityManager.pickRandomCelebrity()
        top.text=celebrity1.name.toString()
        bottom.text=celebrity2.name.toString()
        score.text="Score:" + totalScore.toString()

        fun success(){
            celebrity1=celebrity2
            celebrity2=celebrityManager.pickRandomCelebrity()
            top.text=celebrity1.name.toString()
            bottom.text=celebrity2.name.toString()
            totalScore+=1
            score.text="Score:" + totalScore.toString()


        }

        fun failure(){
            Log.d("failure", "was indeed called")
            val intent= Intent(this, GameOver::class.java)
            intent.putExtra("totalScore", totalScore)
            startActivity(intent)
        }

        earlier.setOnClickListener {
            if (celebrity1.deathYear>=celebrity2.deathYear){
                success()
        } else{
            failure()
            }
        }

        later.setOnClickListener {
            if (celebrity2.deathYear<=celebrity1.deathYear){
                success()
            }
            else{
                failure()
            }
        }


    }
}