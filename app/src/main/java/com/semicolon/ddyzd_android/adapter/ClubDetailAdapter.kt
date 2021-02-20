package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.*
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class ClubDetailAdapter(private val feeds:MutableLiveData<List<MainFeedData>>,private val viewModel: ClubDetailsViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_HEADER=0
    private val TYPE_MEMBER=1
    private val TYPE_FEED=2
    private val TYPE_IMAGE_FEED=3
    lateinit var pageAdapter:ClubFeedPagerAdapter

    inner class HeaderDetailViewHolder(val binding: ItemClubDetailHeaderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            binding.vm=viewModel
            binding.executePendingBindings()
        }
    }

    inner class MembersDetailViewHolder(val binding: ItemMemberListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            binding.vm=viewModel
        }
    }

    inner class ClubFeedViewHolder(val binding: ItemClubFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int){
            binding.vm=viewModel
            binding.position = position-2
            binding.executePendingBindings()
        }
    }

    inner class ClubImageFeedViewHolder(val binding: ItemClubImageFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int){
            pageAdapter=ClubFeedPagerAdapter(feeds.value?.get(position-2)!!.media,position-1,binding)
            binding.vm = viewModel
            binding.position = position-2
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            TYPE_HEADER->{
                val binding=ItemClubDetailHeaderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                HeaderDetailViewHolder(binding)
            }
            TYPE_MEMBER->{
                val binding=ItemMemberListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                MembersDetailViewHolder(binding)
            }
            TYPE_IMAGE_FEED->{
                val binding=ItemClubImageFeedBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                ClubImageFeedViewHolder(binding)
            }
            else->{
                val binding=ItemClubFeedBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                ClubFeedViewHolder(binding)
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
        if(position==0){
            (holder as HeaderDetailViewHolder).bind()
        }
        else if(position==1){
            (holder as MembersDetailViewHolder).bind()
        }
        else{
            val obj = feeds.value?.get(position-2)
            if(obj!=null){
                if (obj.media.size>0) {
                    (holder as ClubFeedViewHolder).bind(position)
                } else {
                    (holder as ClubImageFeedViewHolder).bind(position)
                }
            }
        }

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