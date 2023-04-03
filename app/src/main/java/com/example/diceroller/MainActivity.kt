package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
   lateinit var image_dice:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        image_dice = findViewById(R.id.image_dice)
        rollButton.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        val randInt :Int = Random.nextInt(6)+1
        val drawableResource = when(randInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        image_dice.setImageResource(drawableResource)


    }
}
