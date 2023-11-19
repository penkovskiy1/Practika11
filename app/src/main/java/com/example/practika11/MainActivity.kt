package com.example.practika11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnLoad(view: View){
        val iv: ImageView = findViewById(R.id.imageView2)
        iv.setImageResource(R.drawable.grusha)
    }

    fun  btnActivia(view: View){
        val intent: Intent = Intent(this@MainActivity,MainActivity2::class.java)
        startActivity(intent)
    }
}