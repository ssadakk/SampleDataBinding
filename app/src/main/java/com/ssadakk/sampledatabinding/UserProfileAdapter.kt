package com.ssadakk.sampledatabinding

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.ssadakk.sampledatabinding.databinding.ItemUserBinding
import kotlinx.android.synthetic.main.item_user.view.*

class UserProfileAdapter(var data: LiveData<ArrayList<User>>) : RecyclerView.Adapter<UserProfileAdapter.ViewHolder>() {

    inner class ViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
    ) {
        var txtName = itemView.txtName
        var txtAge = itemView.txtAge
        var txtLike = itemView.txtLike
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        data.value!!.get(position).let { item ->
            with(holder) {
                txtName.text = item.name
                txtAge.text = item.age.toString()
                txtLike.text = item.like.toString()
            }
        }
    }

    override fun getItemCount(): Int {
        return data.value!!.size
    }
}