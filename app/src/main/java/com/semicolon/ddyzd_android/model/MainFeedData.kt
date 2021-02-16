package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class MainFeedData(
    @SerializedName("feedId") val feedId:String,
    @SerializedName("clubName")val clubName:String,
    @SerializedName("profileImage")val profileImage:String,
    @SerializedName("uploadAt")val uploadAt:String,
    @SerializedName("content")val content:String,
    @SerializedName("media" )val media:ArrayList<String>,//나중에 바꾸자
    @SerializedName("flags") var flags:String,
    @SerializedName("flag") var flag:Boolean,
    @SerializedName("follow")val follow:Boolean
)