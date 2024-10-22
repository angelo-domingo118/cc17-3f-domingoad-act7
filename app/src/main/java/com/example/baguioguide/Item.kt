package com.example.baguioguide

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed interface Item : Parcelable {
    val name: String
    val imageResId: Int
}

@Parcelize
data class Attraction(
    override val name: String,
    val description: String,
    val location: String,
    val hours: String,
    val fee: String,
    val additionalInfo: String,
    override val imageResId: Int
) : Item

@Parcelize
data class Activity(
    override val name: String,
    val description: String,
    val location: String,
    val entranceFee: String,
    val activities: String,
    override val imageResId: Int
) : Item

@Parcelize
data class Dining(
    override val name: String,
    val specialty: String,
    val location: String,
    val priceRange: String,
    override val imageResId: Int
) : Item

@Parcelize
data class Shopping(
    override val name: String,
    val description: String,
    val location: String,
    val additionalInfo: String,
    override val imageResId: Int
) : Item
