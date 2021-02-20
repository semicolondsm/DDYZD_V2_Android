package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemMemberProfileBinding
import com.semicolon.ddyzd_android.model.MembersData
import com.semicolon.ddyzd_android.viewmodel.ClubDetailsViewModel

class ClubMemberAdapter(val members:MutableLiveData<List<MembersData>>,val viewModel:ClubDetailsViewModel):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ClubMemberViewHolder(val binding:ItemMemberProfileBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(viewModel:ClubDetailsViewModel,position: Int){
            if(position==0){
                binding.captainTv.visibility= View.VISIBLE
            }
            binding.vm=viewModel
            binding.position=position
            binding.executePendingBindings()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemMemberProfileBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ClubMemberViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return if(members.value!=null){
            members.value!!.size
        }else{
            0
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClubMemberViewHolder).bind(viewModel,position)
    }

}