package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class ClubAdapter (val clubAdapter: ArrayList<ClubProfiles>) : RecyclerView.Adapter<ClubAdapter.CustomViewHolder>() //이거를 Frag1ViewModel에 연결을 하면 됨!!!
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_club,parent,false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener { // 클릭한 경우 여기다 적기
                var name = clubAdapter[adapterPosition].name
                var example = clubAdapter[adapterPosition].example
                var image = clubAdapter[adapterPosition].image


            }

        }
    }

    override fun onBindViewHolder(holder: ClubAdapter.CustomViewHolder, position: Int) {
        holder.image.setImageResource(clubAdapter[position].image )
        holder.clubname.text = clubAdapter[position].name
        holder.example.text = clubAdapter[position].example
    }

    override fun getItemCount(): Int {
        return clubAdapter.size.apply {
            println("${clubAdapter.size} 이게 어떤 숫자")
        }
    }

    class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val clubname: TextView = itemView.findViewById(R.id.clubname)
        val example: TextView = itemView.findViewById(R.id.example)
    }

}