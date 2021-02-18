package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ActivityChatListBinding
import com.semicolon.ddyzd_android.databinding.ItemFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding
import com.semicolon.ddyzd_android.databinding.ListChatBinding
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ClubListData
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.ul.activity.ChatList
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import kotlin.math.sign

class ChatListAdapter(private val list: MutableLiveData<List<ChatListData>>, val viewModel: ChatListViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    inner class ImageViewHolder(private val binding : ListChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChatListViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
         val binding = ListChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(list.value !=null){
            (holder as ChatListAdapter.ImageViewHolder).bind(position, viewModel)
        }
    }

    override fun getItemCount(): Int {
        return if (list.value != null) {
            list.value!!.size
        } else {
            1
        }
    }
}