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

class ChatListAdapter(private val chatListAdapter: MutableLiveData<List<ChatListData>>, val viewModel: ChatListViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val TEXT_TYPE = 0
    private val IMAGE_TYPE = 1

    inner class TextViewHolder(private val binding :ListChatBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: ChatListViewModel) {
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class ImageViewHolder(private val binding : ListChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChatListViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            TEXT_TYPE->{
                val binding = ListChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                TextViewHolder(binding)
            }
            else -> {
                val binding = ListChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ImageViewHolder(binding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val obj = chatListAdapter.value?.get(position-1)
        when(position){
                obj?.clubimage-> {
                    (holder as ChatListAdapter.ImageViewHolder).bind(position, viewModel)
                }
            else ->{
                (holder as ChatListAdapter.TextViewHolder).bind(position, viewModel)
            }
        }
    }

    override fun getItemCount(): Int {
        return chatListAdapter.value!!.size
    }


    override fun getItemViewType(position: Int): Int {
        return when(position){
            chatListAdapter.value?.get(position-1)?.clubimage -> {
                IMAGE_TYPE
            }
            else -> {
                TEXT_TYPE
            }
        }
    }
}