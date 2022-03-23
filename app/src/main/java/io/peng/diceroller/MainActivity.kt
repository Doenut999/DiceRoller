package io.peng.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.peng.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButton.setOnClickListener{
            rollDice()
    }

}
    private val valueRange = (1..6) //sides of a die, range from 1 to 6
    private fun rollDice(){
        val activeSide = valueRange.random() //to pick a random side of a die
        binding.activeSide.text = activeSide.toString() //setting the textView text value tp the random value we got
        if (activeSide==6) {
            Toast.makeText(this, "You  rolled a 6, yay!", Toast.LENGTH_SHORT).show()
        }
        when (activeSide) {
            //to return a different dice image based on the value of activeSide
            1 -> binding.dice.setImageResource(R.drawable.roll_1)
            2 -> binding.dice.setImageResource(R.drawable.roll_2)
            3 -> binding.dice.setImageResource(R.drawable.roll_3)
            4 -> binding.dice.setImageResource(R.drawable.roll_4)
            5 -> binding.dice.setImageResource(R.drawable.roll_5)
            6 -> binding.dice.setImageResource(R.drawable.roll_6)
        }
    }
}