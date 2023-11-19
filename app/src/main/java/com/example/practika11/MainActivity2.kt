package com.example.practika11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    var status:Boolean = false
    fun btnImage(view: View){
        val btn: ImageButton = view as ImageButton
        if (status == false) {
            btn.setImageResource(R.drawable.btn_check_buttonless_on)
            status = true
        }
        else if (status == true){
            btn.setImageResource(R.drawable.btn_check_buttonless_off)
            status = false
        }
    }
}