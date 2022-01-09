package com.gabriel.lab01kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.gabriel.lab01kotlin.R.drawable.*

class MainActivity() : AppCompatActivity() {

    constructor(parcel: Parcel) : this()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClear =  findViewById<Button>(R.id.clear)
        val textSum     =  findViewById<TextView>(R.id.sum)
        val buttonScroll=  findViewById<Button>(R.id.scrolling)
        val Image       =  findViewById<ImageView>(R.id.image)


        buttonClear.setOnClickListener {
            textSum.text = "1"
            Image.setImageResource(lado1)
        }

        buttonScroll.setOnClickListener {
            val rd = random()
            lado(rd)
            textSum.text = (textSum.getText().toString().toInt() + rd).toString()

        }
    }

    fun lado(a:Int) {
        val Image = findViewById<ImageView>(R.id.image)
        return when (a) {
            1 -> Image.setImageResource(lado1)
            2 -> Image.setImageResource(lado2)
            3 -> Image.setImageResource(lado3)
            4 -> Image.setImageResource(lado4)
            5 -> Image.setImageResource(lado5)
            6 -> Image.setImageResource(lado6)
            else -> {

            }
        }

    }


}
