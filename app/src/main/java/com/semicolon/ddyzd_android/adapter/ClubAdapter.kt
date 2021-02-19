package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.databinding.ItemClubBinding
import com.semicolon.ddyzd_android.model.ClubProfiles
import com.semicolon.ddyzd_android.ul.activity.MainActivity
import com.semicolon.ddyzd_android.viewmodel.ClubListViewModel

class ClubAdapter(val clubAdapter: ArrayList<ClubProfiles>, val viewModel: ClubListViewModel) :
    RecyclerView.Adapter<ClubAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = ItemClubBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(position, viewModel = viewModel)
    }

    override fun getItemCount(): Int {
        return clubAdapter.size
    }

    class CustomViewHolder(private val binding: ItemClubBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: ClubListViewModel) {
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }

}