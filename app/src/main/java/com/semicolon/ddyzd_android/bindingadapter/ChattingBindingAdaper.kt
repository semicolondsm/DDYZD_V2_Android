package com.semicolon.ddyzd_android.bindingadapter

import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Spinner
import android.widget.SpinnerAdapter
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.adapter.ChattingAdapter
import com.semicolon.ddyzd_android.viewmodel.ChatListViewModel

object ChattingBindingAdaper {
    @JvmStatic
    @BindingAdapter("verChattingAdapter")
    fun chattingListAdapter(recyclerView: RecyclerView, adapter: ChattingAdapter){
        val layoutManager= LinearLayoutManager(recyclerView.context)
        layoutManager.orientation= RecyclerView.VERTICAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter
    }
    @JvmStatic
    @BindingAdapter("chattingImageUrl")
    fun loadImage(imageView: ImageView, url:String?){
        if(url != null){
            Glide.with(imageView.context)
                .load("https://api.semicolon.live/file/$url")
                .error(R.drawable.group).into(imageView)
        }
    }
    @JvmStatic
    @BindingAdapter("visible")
    fun setVisible(view: View, isVisible: Boolean) {
        view.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("spinner_adapter")
    fun spinnerAdapter(spinner:Spinner,adapter:SpinnerAdapter?){
        spinner.adapter=adapter
    }

    @JvmStatic
    @BindingAdapter("spinner_select")
    fun spinnerSelect(spinner: Spinner,viewModel:ChatListViewModel){
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener,View.OnTouchListener{

            var userSelect=false
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(userSelect){
                    viewModel.index.value=position
                    viewModel.selectPeople()
                    userSelect=false
                }

            }

            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                userSelect=true
            }

        }
    }


}