package com.example.ibmcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calcolaBMI(v: View) {
        val altezza = altezzaMetriText.text.toString().toDouble()
        val peso = pesoKgText.text.toString().toDouble()
        val ibm = peso / (altezza * altezza)
        resultText.text = ibm.toInt().toString()
        if(ibm<18.5) {
            resultImage.setImageResource(R.drawable.underweight)
        } else if(ibm>=18.5 && ibm<24.9) {
            resultImage.setImageResource(R.drawable.normal)
        } else if(ibm>=24.9 && ibm<29.9) {
            resultImage.setImageResource(R.drawable.overweight)
        }else if(ibm>=29.9 && ibm<34.9) {
            resultImage.setImageResource(R.drawable.obese)
        } else if(ibm>=34.9) {
            resultImage.setImageResource(R.drawable.extremely_obese)
        }
    }
}