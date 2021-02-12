package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class ChatListAdapter(private val chatListAdapter: ArrayList<ChatListData>, val navigator: MainActivity) : RecyclerView.Adapter<ChatListAdapter.CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_chat,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.image.setImageResource(chatListAdapter[position].clubImage)
        holder.clubname.text = chatListAdapter[position].clubName
        holder.example.text = chatListAdapter[position].lastMessage
    }

    override fun getItemCount(): Int {
        return chatListAdapter.size
    }

    class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val clubname: TextView = itemView.findViewById(R.id.clubname)
        val example: TextView = itemView.findViewById(R.id.example)
    }
}