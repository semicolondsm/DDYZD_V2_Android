package com.semicolon.ddyzd_android.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ChatListAdapter
import com.semicolon.ddyzd_android.adapter.ClubMemberAdapter

object ClubListBindingAdapter {
    @JvmStatic
    @BindingAdapter("verChatListAdapter")
    fun clubListAdapter(recyclerView: RecyclerView, adapter: ChatListAdapter){
        val layoutManager= LinearLayoutManager(recyclerView.context)
        layoutManager.orientation=RecyclerView.VERTICAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }

    @JvmStatic
    @BindingAdapter("chatImageUrl")
    fun loadImage(imageView: ImageView, url:String){
        if(url != null){
            Glide.with(imageView.context)
                .load("https://api.semicolon.live/file/$url")
                .error(R.drawable.group).into(imageView)
        }
    }

    @JvmStatic
    @BindingAdapter("members_adapter")
    fun memberAdapter(recyclerView: RecyclerView,adapter:ClubMemberAdapter){
        val layoutManager=LinearLayoutManager(recyclerView.context)
        layoutManager.orientation=RecyclerView.HORIZONTAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }
}