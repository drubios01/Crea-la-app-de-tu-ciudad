package com.example.granada.model

import androidx.lifecycle.ViewModel
import com.example.granada.data.Place
import com.example.granada.R

class GranadaViewModel : ViewModel() {
    private val _places = listOf(
        // Monumentos
        Place(1, "La Alhambra", "Monumentos", R.string.alhambra_descripcion, "37.1761, -3.5881", R.drawable.alhambra),
        Place(2, "Catedral de Granada", "Monumentos", R.string.catedral_granada_descripcion, "37.1767, -3.5990", R.drawable.catedral_granada),
        Place(3, "Generalife", "Monumentos", R.string.generalife_descripcion, "37.1761, -3.5833", R.drawable.generalife),

        // Parques
        Place(4, "Parque de las Ciencias", "Parques", R.string.parque_ciencias_descripcion, "37.1618, -3.6086", R.drawable.parque_ciencias),
        Place(5, "Parque García Lorca", "Parques", R.string.parque_garcia_lorca_descripcion, "37.1642, -3.6052", R.drawable.parque_garcia_lorca),
        Place(6, "Parque del Zaidín", "Parques", R.string.parque_zaidin_descripcion, "37.1579, -3.6014", R.drawable.parque_zaidin),

        // Miradores
        Place(7, "Mirador de San Nicolás", "Miradores", R.string.mirador_san_nicolas_descripcion, "37.1799, -3.5921", R.drawable.mirador_san_nicolas),
        Place(8, "Mirador de la Churra", "Miradores", R.string.mirador_churra_descripcion, "37.1781, -3.5895", R.drawable.mirador_churra),
        Place(9, "Mirador de San Cristóbal", "Miradores", R.string.mirador_san_cristobal_descripcion, "37.1835, -3.5923", R.drawable.mirador_san_cristobal)
    )

    val places: List<Place> = _places
    fun getPlacesByCategory(category: String): List<Place> = _places.filter { it.category == category }
    fun getPlaceById(id: Int): Place? = _places.find { it.id == id }
}