package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class MainFeedData(
    @SerializedName("feedId") val feedId:String,
    @SerializedName("clubName")val clubName:String,
    @SerializedName("profileImage")val profileImage:String,
    @SerializedName("uploadAt")val uploadAt:String,
    @SerializedName("content")val content:String,
    @SerializedName("media" )val media:Any,//나중에 바꾸자
    @SerializedName("flags")val flags:String,
    @SerializedName("flag")val flag:Boolean,
    @SerializedName("follow")val follow:Boolean
)