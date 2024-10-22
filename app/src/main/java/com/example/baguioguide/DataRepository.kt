package com.example.baguioguide

class DataRepository {
    fun getCulturalAttractions(): List<Attraction> = DataSource.culturalAttractions
    fun getOutdoorActivities(): List<Activity> = DataSource.activities
    fun getDiningOptions(): List<Dining> = DataSource.diningOptions
    fun getShoppingExperiences(): List<Shopping> = DataSource.shoppingExperiences
}
