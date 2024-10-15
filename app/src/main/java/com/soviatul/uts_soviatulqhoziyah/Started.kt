package com.soviatul.uts_soviatulqhoziyah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Started : AppCompatActivity() {
    private lateinit var btnlogin : Button
    private lateinit var btnsignup : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_started)

        btnlogin =findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener {
            val intent = Intent(this,Log_In::class.java)
            startActivity(intent)
        }

        btnsignup =findViewById(R.id.btnsignup)

        btnsignup.setOnClickListener {
            val intent = Intent(this,Sign_Up::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}