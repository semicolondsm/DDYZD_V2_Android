package com.semicolon.ddyzd_android.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.databinding.adapters.ListenerUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.FeedPagerAdapter
import com.semicolon.ddyzd_android.adapter.MainFeedAdapter
import com.semicolon.ddyzd_android.bindingadapter.MainFeedBindingAdapter.onScrollListener

object MainFeedBindingAdapter {
    @JvmStatic
    @BindingAdapter("verMainFeedAdapter")
    fun mainFeedAdapter(recyclerView: RecyclerView,adapter:MainFeedAdapter){
        val layoutManager=LinearLayoutManager(recyclerView.context)
        layoutManager.orientation=RecyclerView.VERTICAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }

    @JvmStatic
    @BindingAdapter("onScrollListener")
    fun onScrollListener(recyclerView: RecyclerView,listener:RecyclerView.OnScrollListener){
        val oldValue=ListenerUtil.trackListener(recyclerView,listener, R.id.main_recyclerview)
        if(oldValue!=null){
            recyclerView.removeOnScrollListener(oldValue)
        }
        if(listener!=null){
            recyclerView.addOnScrollListener(listener)
        }
    }

    @JvmStatic
    @BindingAdapter("mainPageAdapter")
    fun pageAdapter(viewPager2: ViewPager2,adapter:FeedPagerAdapter){
        if(adapter!=null){
            viewPager2.adapter=adapter
            viewPager2.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        }
    }
}