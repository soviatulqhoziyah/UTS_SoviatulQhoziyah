package com.soviatul.uts_soviatulqhoziyah

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class Log_In : AppCompatActivity() {
    private lateinit var txtsignup : TextView
    private lateinit var btnlogin : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        txtsignup = findViewById(R.id.txtsign)

        txtsignup.setOnClickListener(){
            val intent = Intent(this, Sign_Up::class.java)
            startActivity(intent)
        }

        btnlogin = findViewById(R.id.Login)

        btnlogin.setOnClickListener(){
            val intent = Intent(this, ListOrderActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}