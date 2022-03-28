package com.darkcoders.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val txtText = findViewById<TextView>(R.id.textView2)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked +=1
            txtText.text = timesClicked.toString()
             Toast.makeText(this , "Hello Guys" , Toast.LENGTH_LONG).show()
        }
    }
}