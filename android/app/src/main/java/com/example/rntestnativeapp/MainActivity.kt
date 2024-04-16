package com.example.rntestnativeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var startButton:Button = findViewById(R.id.button);
        startButton.setOnClickListener {
            val intent = Intent(this, RNViewHostActivity::class.java)
            startActivity(intent)
        }
    }
}