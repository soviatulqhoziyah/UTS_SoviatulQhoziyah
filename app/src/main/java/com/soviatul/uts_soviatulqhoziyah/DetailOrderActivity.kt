package com.soviatul.uts_soviatulqhoziyah

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.soviatul.uts_soviatulqhoziyah.model.ModelListOrder

class DetailOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_order)

        val order = intent.getSerializableExtra("order") as? ModelListOrder
        val orderImage: ImageView = findViewById(R.id.orderImage)
        val orderName: TextView = findViewById(R.id.orderName)

        order?.let {
            orderImage.setImageResource(it.imageResId)
            orderName.text = it.name
            // Tampilkan informasi lainnya sesuai dengan detail yang diperlukan
        }
    }
}