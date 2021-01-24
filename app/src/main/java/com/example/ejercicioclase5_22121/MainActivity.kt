package com.example.ejercicioclase5_22121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    private val numbersList = listOf("one", "five",
        "two", "three", "four")
    private val instanceList = listOf(null, 1, "two",
        3.0, "four")
    private val numbersMap = mapOf("key1" to 1,
        "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    private lateinit var boton1: Button
    private lateinit var boton2: Button
    private lateinit var boton3: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)

        boton1 = findViewById(R.id.button5)
        boton1.setOnClickListener {
            val numbers = numbersList.filter {
                it.length >3
            }
            textView.setText(numbers.toString())
        }
        boton2 = findViewById(R.id.button4)
        boton2.setOnClickListener {
          instanceList.filterIsInstance<String>().forEach{
              textView.setText(it.toUpperCase())
          }

        }
    }

}