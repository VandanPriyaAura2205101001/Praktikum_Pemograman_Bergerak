package com.example.intentpraktikum


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var btnOpenSecond: Button? = null

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenSecond = findViewById(R.id.btnOpenSecond)

        btnOpenSecond!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Explicit Intent ke SecondActivity
                val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        })
        val btnOpenBrowser = findViewById<Button?>(R.id.btnOpenBrowser)
        btnOpenBrowser.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unipma.ac.id"))
                startActivity(intent)
            }
        })

        val btnCircleArea = findViewById<Button?>(R.id.btnCircleArea)
        btnCircleArea.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent: Intent = Intent(this@MainActivity, CircleAreaActivity::class.java)
                startActivity(intent)
            }
        })

    }
}