package com.example.baguioguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActivityAdapter(
    private var activities: List<Activity>,  // Change 'val' to 'var'
    private val onItemClick: (Activity) -> Unit
) : RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
        val titleView: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ActivityViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val activity = activities[position]
        holder.imageView.setImageResource(activity.imageResId)
        holder.titleView.text = activity.name
        holder.itemView.setOnClickListener { onItemClick(activity) }
    }

    override fun getItemCount() = activities.size

    // Add this method to the ActivityAdapter class
    fun updateActivities(newActivities: List<Activity>) {
        activities = newActivities
        notifyDataSetChanged()
    }
}
