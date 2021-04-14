package com.semicolon.ddyzd_android.adapter

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.semicolon.ddyzd_android.databinding.ItemFeedBinding
import com.semicolon.ddyzd_android.databinding.ItemFeedHeaderBinding
import com.semicolon.ddyzd_android.databinding.ItemImageFeedBinding
import com.semicolon.ddyzd_android.model.MainFeedData
import com.semicolon.ddyzd_android.viewmodel.MainFeedViewModel

class MainFeedAdapter(
    private val feeds: MutableLiveData<List<MainFeedData>>,
    private val viewModel: MainFeedViewModel
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val MAIN_FEED_TYPE = 0
    private val IMAGE_FEED_TYPE = 1
    private val HEADER_FEED_TYPE = 2
    lateinit var pageAdapter: FeedPagerAdapter

    inner class MainFeedViewHolder(private val binding: ItemFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: MainFeedViewModel) {
            binding.vm = viewModel
            binding.position = position - 1
            binding.executePendingBindings()
        }
    }

    inner class ImageFeedViewHolder(private val binding: ItemImageFeedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, viewModel: MainFeedViewModel) {
            pageAdapter = FeedPagerAdapter(feeds.value?.get(position - 1)!!.media, binding)
            binding.vm = viewModel
            binding.position = position - 1
            binding.executePendingBindings()
        }
    }

    inner class HeaderFeedViewHolder(private val binding: ItemFeedHeaderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(viewModel: MainFeedViewModel) {
            binding.vm = viewModel
            binding.headerWebview.settings.javaScriptEnabled = true
            binding.headerWebview.webViewClient = WebViewClient()
            binding.headerWebview.settings.domStorageEnabled = true
            binding.headerWebview.loadUrl("https://ddyzd.dsmkr.com/mobile/banner")
            binding.headerWebview.webChromeClient = object : WebChromeClient() {
                override fun onConsoleMessage(consoleMessage: ConsoleMessage?): Boolean {
                    consoleMessage?.apply {
                        Log.d(
                            "MyApplication",
                            "${message()} -- From line ${lineNumber()} of ${sourceId()}"
                        )
                    }
                    return true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MAIN_FEED_TYPE -> {
                val binding =
                    ItemFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                MainFeedViewHolder(binding)
            }
            IMAGE_FEED_TYPE -> {
                val binding =
                    ItemImageFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ImageFeedViewHolder(binding)
            }
            else -> {
                val binding =
                    ItemFeedHeaderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                HeaderFeedViewHolder(binding)
            }
        }
    }

    override fun getItemCount(): Int {
        return if (feeds.value != null) {
            feeds.value!!.size + 1
        } else {
            1
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position == 0) {
            (holder as HeaderFeedViewHolder).bind(viewModel)
        } else {
            val obj = feeds.value?.get(position - 1)
            if (obj != null) {
                if (obj.media.size > 0) {
                    (holder as ImageFeedViewHolder).bind(position, viewModel)
                } else {
                    (holder as MainFeedViewHolder).bind(position, viewModel)
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            HEADER_FEED_TYPE
        } else if (feeds.value?.get(position - 1)?.media?.size!! > 0) {
            IMAGE_FEED_TYPE
        } else {
            MAIN_FEED_TYPE
        }
    }
}