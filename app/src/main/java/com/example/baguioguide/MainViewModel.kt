package com.example.baguioguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
        val categoryList = listOf(
            Category("Cultural Attractions", R.drawable.culture),
            Category("Outdoor Activities", R.drawable.outdoor),
            Category("Dining Options", R.drawable.dining),
            Category("Shopping Experiences", R.drawable.shopping)
        )
        _categories.value = categoryList
    }
}
