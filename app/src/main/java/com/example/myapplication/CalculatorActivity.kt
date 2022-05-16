package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var btnAdding:Button
    lateinit var btnSubstract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvTotal:TextView
    lateinit var etFirstNumber:EditText
    lateinit var etSecondNumber:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        btnAdding=findViewById(R.id.btnAdding)
        btnSubstract=findViewById(R.id.btnSubstract)
        btnModulus=findViewById(R.id.btnModulus)
        btnMultiply=findViewById(R.id.btnMultiply)
        tvTotal=findViewById(R.id.tvTotal)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)

        btnAdding.setOnClickListener {
            tvTotal.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNumber.text.toString().toDouble()
            addition(number1,number2)
        }
        btnSubstract.setOnClickListener {
            tvTotal.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNumber.text.toString().toDouble()
            substraction(number1,number2)
        }
        btnMultiply.setOnClickListener {
            tvTotal.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNumber.text.toString().toDouble()
            multiplication(number1,number2)
        }
        btnModulus.setOnClickListener {
            tvTotal.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNumber.text.toString().toDouble()
            modulus(number1,number2)
        }
    }
    fun addition(number1:Double,number2:Double){
        val add=number1+number2
        tvTotal.text=add.toString()

    }
    fun substraction(number1:Double,number2:Double){
        val subtract=number1-number2
        tvTotal.text=subtract.toString()

    }
    fun multiplication(number1:Double,number2:Double){
        val multiply=number1*number2
        tvTotal.text=multiply.toString()

    }
    fun modulus(number1:Double,number2:Double){
        val remainder=number1%number2
        tvTotal.text=remainder.toString()

    }
}