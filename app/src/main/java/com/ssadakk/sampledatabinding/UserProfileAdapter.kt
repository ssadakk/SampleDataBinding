package com.ssadakk.sampledatabinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ssadakk.sampledatabinding.databinding.ItemUserBinding

class UserProfileAdapter(private val dataSet:ArrayList<UserProfile>) : RecyclerView.Adapter<UserProfileAdapter.ViewHolder>() {

    class ViewHolder(private val binding:ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: UserProfile) {
            with(binding) {
                userData = item
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding : ItemUserBinding = ItemUserBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}