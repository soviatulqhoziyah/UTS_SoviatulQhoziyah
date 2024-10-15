package com.soviatul.uts_soviatulqhoziyah.model

import java.io.Serializable


data class ModelListOrder(
    val imageResId: Int,
    val name: String,
    val price: String,
    val date: String,
    val items: Int
) : Serializable
