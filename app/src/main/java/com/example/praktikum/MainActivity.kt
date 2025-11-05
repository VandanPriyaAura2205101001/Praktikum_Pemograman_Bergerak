package com.example.praktikum;




import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gridview)

        val gridView = findViewById<View?>(R.id.grid_view) as GridView

        // Instance of ImageAdapter Class
        gridView.setAdapter(ImageAdapter(this))
    }

}