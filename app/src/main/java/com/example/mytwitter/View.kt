package com.example.mytwitter

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class View : AppCompatActivity() {
    lateinit var btnDismiss:Button
    lateinit var btnView: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        btnDismiss=findViewById(R.id.btnDismiss)
        btnDismiss.setOnClickListener {
            var intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnView =findViewById(R.id.btnView)
        btnView.setOnClickListener {
            var intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}