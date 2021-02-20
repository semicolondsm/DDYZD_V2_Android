package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class ClubInDetailData(
    val clubid:String,
    val clubname:String,
    val clubtag:String,
    val clubimage:String,
    val backimage:String,
    val description:String,
    val owner:Boolean,
    val follow:Boolean,
    val recruitment:Boolean,
    val recruitment_close:String
)