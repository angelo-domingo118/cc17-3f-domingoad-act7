package com.example.baguioguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoppingExperiencesViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _shoppingExperiences = MutableLiveData<List<Shopping>>()
    val shoppingExperiences: LiveData<List<Shopping>> = _shoppingExperiences

    init {
        loadShoppingExperiences()
    }

    private fun loadShoppingExperiences() {
        _shoppingExperiences.value = repository.getShoppingExperiences()
    }
}
