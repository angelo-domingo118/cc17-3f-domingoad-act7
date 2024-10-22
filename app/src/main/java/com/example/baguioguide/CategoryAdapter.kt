package com.example.baguioguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    private var categories: List<Category>,
    private val onItemClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category_grid, parent, false)
        return CategoryViewHolder(view, onItemClick)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

    override fun getItemCount() = categories.size

    fun updateCategories(newCategories: List<Category>) {
        categories = newCategories
        notifyDataSetChanged()
    }

    class CategoryViewHolder(itemView: View, private val onItemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.categoryImage)
        private val textView: TextView = itemView.findViewById(R.id.categoryName)

        fun bind(category: Category) {
            imageView.setImageResource(category.imageResId)
            textView.text = category.name
            itemView.setOnClickListener { onItemClick(category) }
        }
    }
}

data class Category(val name: String, val imageResId: Int)
