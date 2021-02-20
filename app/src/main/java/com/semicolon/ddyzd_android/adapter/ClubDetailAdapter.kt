package com.semicolon.ddyzd_android.adapter

import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBinding
import com.semicolon.ddyzd_android.databinding.ItemClubDetailMembersBinding
import com.semicolon.ddyzd_android.databinding.ItemFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding
import com.semicolon.ddyzd_android.model.MainFeedData

class ClubDetailAdapter(private val feeds:MutableLiveData<List<MainFeedData>>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_HEADER=0
    private val TYPE_MEMBER=1
    private val TYPE_FEED=2
    private val TYPE_IMAGE_FEED=3
    inner class HeaderDetailViewHolder(val binding: ItemClubDetailHeaderBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    inner class MembersDetailViewHolder(val binding: ItemClubDetailMembersBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    inner class ClubFeedViewHolder(val binding: ItemFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    inner class ClubImageFeedViewHolder(val binding: ItemImageFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            TYPE_HEADER->{
                
            }
        }
    }

    override fun getItemCount(): Int {
        return if(feeds.value!=null){
            feeds.value!!.size+2
        }else{
            2
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return if(position==0){
            TYPE_HEADER
        }else if(position==1){
            TYPE_MEMBER
        }else if(feeds.value?.get(position-2)?.media?.size!! >0){
            TYPE_IMAGE_FEED
        }else{
            TYPE_FEED
        }
    }
}