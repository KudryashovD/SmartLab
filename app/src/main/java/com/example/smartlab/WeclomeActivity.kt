package com.example.smartlab

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeclomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_window)
        val unicode = 0x1F60A
        val textView: TextView = findViewById(R.id.Welcome) as TextView
        textView.setOnClickListener {
            textView.text = getString(unicode)
        }
    }
}