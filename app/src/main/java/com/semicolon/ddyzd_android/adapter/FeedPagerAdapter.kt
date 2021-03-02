package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayoutMediator
import com.semicolon.ddyzd_android.databinding.ItemClubImageFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemPageImageBinding
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class FeedPagerAdapter(private val images: List<String?>,private val feedPosition:Int,private val imageBinding:ItemImageFeedBinding) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ImageViewHolder(private val imageView: ItemPageImageBinding) :
        RecyclerView.ViewHolder(imageView.root) {
        fun bind(position: Int){
            TabLayoutMediator(
                imageBinding.indicator,
                imageBinding.imageView4
            ){
                    tab, position ->
                imageBinding.imageView4.currentItem = tab.position
            }.attach()
            imageView.position=feedPosition
            imageView.pagePosition=position
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
        (holder as ImageViewHolder).bind(position)
    }
}
class ClubFeedPagerAdapter(private val images: List<String?>,private val feedPosition:Int,private val imageBinding:ItemClubImageFeedBinding) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ImageViewHolder(private val imageView: ItemPageImageBinding) :
        RecyclerView.ViewHolder(imageView.root) {
        fun bind(position: Int){
            TabLayoutMediator(
                imageBinding.indicator,
                imageBinding.imageView4
            ){
                    tab, position ->
                imageBinding.imageView4.currentItem = tab.position
            }.attach()
            imageView.position=feedPosition
            imageView.pagePosition=position
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
        (holder as ImageViewHolder).bind(position)
    }

}