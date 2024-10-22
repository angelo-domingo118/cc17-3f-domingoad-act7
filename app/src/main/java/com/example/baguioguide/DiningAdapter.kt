package com.example.baguioguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DiningAdapter(
    private var diningOptions: List<Dining>,  // Change 'val' to 'var'
    private val onItemClick: (Dining) -> Unit
) : RecyclerView.Adapter<DiningAdapter.DiningViewHolder>() {

    class DiningViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiningViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return DiningViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiningViewHolder, position: Int) {
        val dining = diningOptions[position]
        holder.imageView.setImageResource(dining.imageResId)
        holder.titleView.text = dining.name
        holder.itemView.setOnClickListener { onItemClick(dining) }
    }

    override fun getItemCount() = diningOptions.size

    // Add this method to the DiningAdapter class
    fun updateDiningOptions(newDiningOptions: List<Dining>) {
        diningOptions = newDiningOptions
        notifyDataSetChanged()
    }
}
