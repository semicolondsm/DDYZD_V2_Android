package com.semicolon.ddyzd_android.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter

object MainFeedBindingAdapter {
    @JvmStatic
    @BindingAdapter("verMainFeedAdapter")
    fun mainFeedAdapter(recyclerView: RecyclerView,adapter:MainFeedAdapter){
        val layoutManager=LinearLayoutManager(recyclerView.context)
        layoutManager.orientation=RecyclerView.VERTICAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }
}