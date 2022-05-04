package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class firstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val image=findViewById<ImageView>(R.id.imageView2)
        image.setImageResource(R.drawable.dice_6)
        val singleDice=findViewById<Button>(R.id.singleDice)
        val twoDice=findViewById<Button>(R.id.twoDice)

        singleDice.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        twoDice.setOnClickListener{
            val intent2 = Intent(this,TwoDice::class.java)
            startActivity(intent2)
        }

    }
}