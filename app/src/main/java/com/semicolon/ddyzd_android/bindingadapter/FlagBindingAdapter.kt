package com.semicolon.ddyzd_android.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.semicolon.ddyzd_android.R

object FlagBindingAdapter {
    @BindingAdapter("flag")
    @JvmStatic
    fun flag(imageView: ImageView,flag:Boolean){
        if(flag){
            imageView.setImageResource(R.drawable.clicked_flag)
        }else{
            imageView.setImageResource(R.drawable.unclicked_flag)
        }
    }
}