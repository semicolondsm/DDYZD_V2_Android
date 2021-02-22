package com.semicolon.ddyzd_android.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.semicolon.ddyzd_android.R

object ProfilePhotoBindingAdapter {
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView:ImageView,url:String?){
        Glide.with(imageView.context)
            .load("https://api.semicolon.live/file/$url")
            .error(R.drawable.group).into(imageView)
    }

    @JvmStatic
    @BindingAdapter("slideImageUrl")
    fun loadSlideImage(imageView: ImageView,url: String?){
        Glide.with(imageView.context)
            .load("https://api.eungyeol.live/file/$url")
            .error(R.drawable.image).into(imageView)
    }

    @JvmStatic
    @BindingAdapter("profileImage")
    fun loadProfileImage(imageView:ImageView,url:String?){
        Glide.with(imageView.context)
            .load(url)
            .error(R.drawable.user).into(imageView)
    }
}