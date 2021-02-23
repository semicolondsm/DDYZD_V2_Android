package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class UserClubData(
    @SerializedName("club_name")val clubName:String,
    @SerializedName("club_id")val clubId:String,
    @SerializedName("club_image")val clubImage:String
)