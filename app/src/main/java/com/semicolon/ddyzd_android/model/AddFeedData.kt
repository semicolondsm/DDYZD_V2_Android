package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class AddFeedData(
    @SerializedName("msg")val msg:String,
    @SerializedName("feedId")val feedId:Int
)