package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class MainFeedAdapter(
    private val feeds: MutableLiveData<List<MainFeedData>>,
    private val viewModel: MainFeedViewModel
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class MainFeedViewHolder(private val binding: ItemFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: MainFeedViewModel) {
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }

    inner class ImageFeedViewHolder(private val binding: ItemImageFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: MainFeedViewModel) {
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0) {
            val binding =
                ItemFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            MainFeedViewHolder(binding)
        } else {
            val binding =
                ItemImageFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            ImageFeedViewHolder(binding)

        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}