package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TwoDice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_dice)
        val rollBtn = findViewById<Button>(R.id.button)
        val diceImage1 = findViewById<ImageView>(R.id.imgDice1)
        val diceImage2 = findViewById<ImageView>(R.id.imgDice2)
        rollBtn.setOnClickListener {
            rollDice(diceImage1)
            rollDice(diceImage2)
        }
        rollDice(diceImage1)
        rollDice(diceImage2)
    }

    fun rollDice(img:ImageView) {
        val dice = Dice(6)
        val myRoll = dice.roll()

        val drawableResource = when (myRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        img.setImageResource(drawableResource)
        img.contentDescription = myRoll.toString()
    }
}