package com.example.baguioguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiningOptionsViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _diningOptions = MutableLiveData<List<Dining>>()
    val diningOptions: LiveData<List<Dining>> = _diningOptions

    init {
        loadDiningOptions()
    }

    private fun loadDiningOptions() {
        _diningOptions.value = repository.getDiningOptions()
    }
}
