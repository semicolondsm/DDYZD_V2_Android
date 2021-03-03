package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class ClubInDetailData(
    @SerializedName("clubid")val clubid:String,
    @SerializedName("clubname")val clubname:String,
    @SerializedName("clubtag")val clubtag:List<String>,
    @SerializedName("clubimage")val clubimage:String,
    @SerializedName("backimage")val backimage:String,
    @SerializedName("description")val description:String,
    @SerializedName("owner")val owner:Boolean,
    @SerializedName("follow") var follow:Boolean,
    @SerializedName("recruitment")val recruitment:Boolean,
    @SerializedName("recruitment_close")val recruitment_close:Date
)