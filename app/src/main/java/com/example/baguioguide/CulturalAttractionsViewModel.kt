package com.example.baguioguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CulturalAttractionsViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _attractions = MutableLiveData<List<Attraction>>()
    val attractions: LiveData<List<Attraction>> = _attractions

    init {
        loadAttractions()
    }

    private fun loadAttractions() {
        _attractions.value = repository.getCulturalAttractions()
    }
}
