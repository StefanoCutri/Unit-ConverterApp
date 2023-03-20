package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare the views
        val btn : Button = findViewById(R.id.btn)
        val editTxt : EditText = findViewById(R.id.edt)
        val result : TextView = findViewById(R.id.lbResult)

        //Show the result
        btn.setOnClickListener(){
            if (editTxt.text.isNotEmpty() ){
                var kilos = editTxt.text.toString().toDouble()
                result.setText(""+ convertToLb(kilos) + "\nlb")
            }else{
                result.setText(""+ 0)
            }

        }

    }
}

//Convert the kg to lb
fun convertToLb(kg: Double): Double {
    val lb = kg * 2.20462262
    var result = Math.round(lb * 10.0) / 10.0
    return result
}