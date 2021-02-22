package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemUserClubBinding
import com.semicolon.ddyzd_android.model.UserClubData

class UserClubsAdapter(val userClubs:MutableLiveData<List<UserClubData>>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class UserClubViewHolder(val binding:ItemUserClubBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.club= userClubs.value?.get(position) ?: UserClubData("로딩실패","","")
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding=ItemUserClubBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserClubViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return if(userClubs.value!=null){
            userClubs.value!!.size
        }else{
            0
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as UserClubViewHolder).bind(position)
    }
}