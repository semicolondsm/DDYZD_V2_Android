package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class ClubAdapter(val clubAdapter: ArrayList<ClubProfiles>, val navigator: MainActivity) : RecyclerView.Adapter<ClubAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_club,parent,false)
        return CustomViewHolder(view).apply {

        }
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.image.setImageResource(clubAdapter[position].image )
        holder.clubname.text = clubAdapter[position].name
        holder.example.text = clubAdapter[position].example
    }

    override fun getItemCount(): Int {
        return clubAdapter.size
    }

    class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

}