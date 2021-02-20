package com.semicolon.ddyzd_android.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemClubDetailHeaderBinding
import com.semicolon.ddyzd_android.databinding.ItemClubDetailMembersBinding
import com.semicolon.ddyzd_android.databinding.ItemFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding

class ClubDetailAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

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
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}