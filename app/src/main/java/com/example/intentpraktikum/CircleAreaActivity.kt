package com.example.intentpraktikum

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CircleAreaActivity : AppCompatActivity() {
    var inputRadius: EditText? = null
    var btnCalculate: Button? = null
    var textResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_area)

        inputRadius = findViewById<EditText?>(R.id.inputRadius)
        btnCalculate = findViewById<Button?>(R.id.btnCalculate)
        textResult = findViewById<TextView?>(R.id.textResult)

        btnCalculate!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val radiusStr = inputRadius!!.getText().toString()

                if (!radiusStr.isEmpty()) {
                    val r = radiusStr.toDouble()
                    val luas = Math.PI * r * r
                    textResult!!.setText("Luas: " + String.format("%.2f", luas))
                } else {
                    inputRadius!!.setError("Masukkan nilai r")
                }
            }
        })
    }
}