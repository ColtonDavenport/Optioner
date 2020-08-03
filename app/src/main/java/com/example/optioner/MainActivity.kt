package com.example.optioner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val optionOneTextView = findViewById<TextView>(R.id.optionOneTextView)
        val optionTwoTextView = findViewById<TextView>(R.id.optionTwoTextView)
        val optionThreeTextView = findViewById<TextView>(R.id.optionThreeTextView)
        val optionerButton = findViewById<Button>(R.id.optionerButton)

        optionerButton.setOnClickListener {
            optionOneTextView.text = Random.nextInt().toString()
            optionTwoTextView.text = Random.nextInt().toString()
            optionThreeTextView.text = Random.nextInt().toString()
        }
    }
}