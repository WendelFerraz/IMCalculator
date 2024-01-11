package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCalculator: Button = findViewById<Button>(R.id.btnCalculator)
        val edtWeight: EditText = findViewById(R.id.edittext_weight)
        val edtHeight: EditText = findViewById(R.id.edittext_height)

        btnCalculator.setOnClickListener {


            val alturaStr = edtHeight.text.toString()
            val pesoStr = edtWeight.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura: Float = alturaStr.toFloat()
                val peso: Float = pesoStr.toFloat()
                val alturaFinal: Float = altura * altura
                val result: Float = peso / alturaFinal


                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("EXTRA_RESULT", result)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_SHORT).show()
            }

        }
    }
    }
