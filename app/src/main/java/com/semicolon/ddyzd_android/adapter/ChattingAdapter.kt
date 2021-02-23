package com.semicolon.ddyzd_android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.*
import com.semicolon.ddyzd_android.model.ChatListData
import com.semicolon.ddyzd_android.model.ChattingData
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel
import com.semicolon.ddyzd_android.viewmodel.ChattingPageViewModel
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

@Suppress("UNREACHABLE_CODE")
class ChattingAdapter(val chatting  : MutableLiveData<List<ChattingData>>, val viewModel: ChattingPageViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val MY_CHAT=0
    private val YOUR_CHAT=1
    private val SCHEDULE_CHAT=2
    private val CLUB_APPLICATION =3
    private val USER_APPLICATION = 4
    private val CLUB_RESULT = 5
    private val USER_RESULT = 6


    inner class MyChatViewHolder(private val binding : ItemMyChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel) {
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }

    inner class YourChatViewHolder(private val binding : ItemYourChatBinding): RecyclerView.ViewHolder(binding.root){ // 이것만 이미지 포함
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class ScheduleChatViewHolder(private val binding : ItemScheduleChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class ClubApplicationChatViewHolder(private val binding : ItemClubApplicationChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class UserApplicationChatViewHolder(private val binding : ItemUserApplicationChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class ClubResultViewHolder(private val binding : ItemClubResultChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }
    inner class UserResultViewHolder(private val binding : ItemUserResultChatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int, viewModel: ChattingPageViewModel){
            binding.vm = viewModel
            binding.position = position
            binding.executePendingBindings()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

         when(viewType){
            MY_CHAT ->{
                val binding = ItemMyChatBinding.inflate(LayoutInflater.from(parent.context))
                return MyChatViewHolder(binding)
            }
            YOUR_CHAT ->{
                val binding = ItemYourChatBinding.inflate(LayoutInflater.from(parent.context))
                return YourChatViewHolder(binding)
            }
            SCHEDULE_CHAT->{
                val binding = ItemScheduleChatBinding.inflate(LayoutInflater.from(parent.context))
                return ScheduleChatViewHolder(binding)
            }
            CLUB_APPLICATION->{
                val binding = ItemClubApplicationChatBinding.inflate(LayoutInflater.from(parent.context))
                return ClubApplicationChatViewHolder(binding)
            }
            USER_APPLICATION->{
                val binding = ItemUserApplicationChatBinding.inflate(LayoutInflater.from(parent.context))
                return UserApplicationChatViewHolder(binding)
            }
            CLUB_RESULT->{
                val binding = ItemClubResultChatBinding.inflate(LayoutInflater.from(parent.context))
                return ClubResultViewHolder(binding)
            }
            USER_RESULT->{
                val binding = ItemUserResultChatBinding.inflate(LayoutInflater.from(parent.context))
                return UserResultViewHolder(binding)
            }
            else -> { // else 안뜨게 처리 함
                val binding = ItemMyChatBinding.inflate(LayoutInflater.from(parent.context))
                return MyChatViewHolder(binding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder.itemViewType){
            MY_CHAT ->{
                (holder as MyChatViewHolder).bind(position,viewModel)
            }
            YOUR_CHAT ->{
                (holder as YourChatViewHolder).bind(position,viewModel)
            }
            SCHEDULE_CHAT->{
                (holder as ScheduleChatViewHolder).bind(position,viewModel)
            }
            CLUB_APPLICATION->{
                (holder as ClubApplicationChatViewHolder).bind(position,viewModel)
            }
            USER_APPLICATION->{
                (holder as UserApplicationChatViewHolder).bind(position,viewModel)
            }
            CLUB_RESULT->{
                (holder as ClubResultViewHolder).bind(position,viewModel)
            }
            USER_RESULT->{
                (holder as UserResultViewHolder).bind(position,viewModel)
            }
            else -> { // else 안뜨게 처리 함

            }
        }
    }


    override fun getItemCount(): Int {
        return when(chatting.value){
            null -> 0
            else -> chatting.value!!.size
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
        when(chatting.value?.get(position)?.create_at){

        }
    }
}