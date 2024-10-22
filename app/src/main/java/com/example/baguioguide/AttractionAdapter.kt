package com.example.baguioguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AttractionAdapter(
    private var attractions: List<Attraction>,
    private val onItemClick: (Attraction) -> Unit
) : RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder>() {

    class AttractionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return AttractionViewHolder(view)
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.imageView.setImageResource(attraction.imageResId)
        holder.titleView.text = attraction.name
        holder.itemView.setOnClickListener { onItemClick(attraction) }
    }

    override fun getItemCount() = attractions.size

    fun updateAttractions(newAttractions: List<Attraction>) {
        attractions = newAttractions
        notifyDataSetChanged()
    }
}
