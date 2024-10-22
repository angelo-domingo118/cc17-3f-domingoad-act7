package com.example.baguioguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OutdoorActivitiesViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _activities = MutableLiveData<List<Activity>>()
    val activities: LiveData<List<Activity>> = _activities

    init {
        loadActivities()
    }

    private fun loadActivities() {
        _activities.value = repository.getOutdoorActivities()
    }
}
