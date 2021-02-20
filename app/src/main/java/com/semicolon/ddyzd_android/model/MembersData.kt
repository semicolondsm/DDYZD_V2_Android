package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class MembersData(
    @SerializedName("user_name")val name:String,
    @SerializedName("profile_image")val imageUrl:String,
    @SerializedName("gcn")val gcn:String,
    @SerializedName("git")val git:String
)