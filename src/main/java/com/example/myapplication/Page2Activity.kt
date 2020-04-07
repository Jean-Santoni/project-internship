package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
    }

    fun retourbutton (view: View){
        val intent2 = Intent(this, MainActivity :: class.java)
        startActivity(intent2)
    }
}
