package com.example.lesson8

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var intMassive = IntArray(5)
    val p = (3.14)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)
        val etNum3 = findViewById<EditText>(R.id.etNum3)
        val etNum4 = findViewById<EditText>(R.id.etNum4)
        val etNum5 = findViewById<EditText>(R.id.etNum5)

        val tvNum1 = findViewById<TextView>(R.id.tvNum1)
        val tvNum2 = findViewById<TextView>(R.id.tvNum2)
        val tvNum3 = findViewById<TextView>(R.id.tvNum3)
        val tvNum4 = findViewById<TextView>(R.id.tvNum4)
        val tvNum5 = findViewById<TextView>(R.id.tvNum5)


        val btnGo = findViewById<Button>(R.id.btnGo)


        intMassive[0] = 4
        intMassive[1] = 45
        intMassive[2] = 234
        intMassive[3] = 235
        intMassive [4] = 23

        etNum1.setText(intMassive[0].toString())
        etNum2.setText(intMassive[1].toString())
        etNum3.setText(intMassive[2].toString())
        etNum4.setText(intMassive[3].toString())
        etNum5.setText(intMassive[4].toString())

        val circle1 = intMassive[0]*p
        val circle2 = intMassive[1]*p
        val circle3 = intMassive[2]*p
        val circle4 = intMassive[3]*p
        val circle5 = intMassive[4]*p

        tvNum1.text = circle1.toString()
        tvNum2.text = circle2.toString()
        tvNum3.text = circle3.toString()
        tvNum4.text = circle4.toString()
        tvNum5.text = circle5.toString()




        btnGo.setOnClickListener {
            intMassive[0] = etNum1.text.toString().toInt()
            intMassive[1] = etNum2.text.toString().toInt()
            intMassive[2] = etNum3.text.toString().toInt()
            intMassive[3] = etNum4.text.toString().toInt()
            intMassive[4] = etNum5.text.toString().toInt()

            val circle1 = intMassive[0]*p
            val circle2 = intMassive[1]*p
            val circle3 = intMassive[2]*p
            val circle4 = intMassive[3]*p
            val circle5 = intMassive[4]*p

            tvNum1.text = circle1.toString()
            tvNum2.text = circle2.toString()
            tvNum3.text = circle3.toString()
            tvNum4.text = circle4.toString()
            tvNum5.text = circle5.toString()

        }






















    }
}