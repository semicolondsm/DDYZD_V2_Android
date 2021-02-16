package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemPageImageBinding
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class FeedPagerAdapter(private val images: List<String>,private val viewModel: MainFeedViewModel,private val feedPosition:Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ImageViewHolder(private val imageView: ItemPageImageBinding) :
        RecyclerView.ViewHolder(imageView.root) {
        fun bind(position: Int,viewModel: MainFeedViewModel){
            imageView.position=feedPosition
            imageView.vm=viewModel
            imageView.pagePositotion=position
            imageView.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemPageImageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ImageViewHolder).bind(position,viewModel)
    }

}