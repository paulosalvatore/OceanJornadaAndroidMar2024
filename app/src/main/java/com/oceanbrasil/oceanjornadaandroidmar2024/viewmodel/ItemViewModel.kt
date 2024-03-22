package com.oceanbrasil.oceanjornadaandroidmar2024.viewmodel

import androidx.lifecycle.ViewModel
import com.oceanbrasil.oceanjornadaandroidmar2024.model.api.ApiRepository

class ItemViewModel : ViewModel() {
    val itens = ApiRepository.itens
}
