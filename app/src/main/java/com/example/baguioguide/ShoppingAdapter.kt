package com.example.baguioguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShoppingAdapter(private var shoppingExperiences: List<Shopping>, private val onItemClick: (Shopping) -> Unit) :
    RecyclerView.Adapter<ShoppingAdapter.ShoppingViewHolder>() {

    class ShoppingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        val shopping = shoppingExperiences[position]
        holder.imageView.setImageResource(shopping.imageResId)
        holder.titleView.text = shopping.name
        holder.itemView.setOnClickListener { onItemClick(shopping) }
    }

    override fun getItemCount() = shoppingExperiences.size

    fun updateShoppingExperiences(newShoppingExperiences: List<Shopping>) {
        shoppingExperiences = newShoppingExperiences
        notifyDataSetChanged()
    }
}



