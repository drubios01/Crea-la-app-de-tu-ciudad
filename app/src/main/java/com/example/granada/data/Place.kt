package com.example.granada.data

import androidx.annotation.StringRes

data class Place(
    val id: Int,
    val name: String,
    val category: String,
    @StringRes val description: Int,
    val location: String,
    val imageResId: Int
)
