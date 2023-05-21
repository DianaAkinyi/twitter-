package com.example.mytwitter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ivImage1: ImageView
    lateinit var ivImage2: ImageView
    lateinit var ivImage3: ImageView
    lateinit var ivImage4: ImageView
    lateinit var ivImage5: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivImage1 = findViewById(R.id.ivImage1)
        ivImage1.setOnClickListener {
            var intent = Intent(this, Comment::class.java)
            startActivity(intent)
        }
        ivImage2 = findViewById(R.id.ivImage2)
        ivImage2.setOnClickListener {
            var intent = Intent(this, Likes::class.java)
            startActivity(intent)

    }
        ivImage3= findViewById(R.id.ivImage3)
        ivImage3.setOnClickListener {
            var intent=Intent(this,Retweet::class.java)
            startActivity(intent)
        }

}
}