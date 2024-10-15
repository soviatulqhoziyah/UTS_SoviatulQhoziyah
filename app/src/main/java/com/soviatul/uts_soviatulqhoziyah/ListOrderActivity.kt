package com.soviatul.uts_soviatulqhoziyah

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.uts_soviatulqhoziyah.adapter.OrderAdapter
import com.soviatul.uts_soviatulqhoziyah.model.ModelListOrder

class ListOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_order)

        val orders = listOf(
            ModelListOrder(R.drawable.yum, "Chicken Curry", "$50.00", "29 Nov, 01:20 pm", 2),
            ModelListOrder(R.drawable.yum2, "Bean and Vegetable Burger", "$50.00", "10 Nov, 06:05 pm", 2),
            ModelListOrder(R.drawable.kopi, "Coffee Latte", "$8.00", "10 Nov, 08:30 am", 1),
            ModelListOrder(R.drawable.stroberi, "Strawberry Cheesecake", "$22.00", "03 Oct, 03:40 pm", 2)
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = OrderAdapter(orders) { order ->
            val intent = Intent(this, DetailOrderActivity::class.java)
            intent.putExtra("order", order)
            startActivity(intent)
        }
    }
}