package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.BaseApi
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class ClubAdapter(val clubAdapter: ArrayList<ClubProfiles>, val navigator: MainActivity) : RecyclerView.Adapter<ClubAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_club,parent,false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener { // 클릭한 경우 여기다 적기

                val club_id = clubAdapter[adapterPosition].club_id
                BaseApi.club_id = club_id
                navigator.changeActivity()
            }
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
        val image: ImageView = itemView.findViewById(R.id.image)
        val clubname: TextView = itemView.findViewById(R.id.clubname)
        val example: TextView = itemView.findViewById(R.id.example)
    }

}