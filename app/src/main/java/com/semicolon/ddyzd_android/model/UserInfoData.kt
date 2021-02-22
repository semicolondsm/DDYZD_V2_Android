package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class UserInfoData(
    @SerializedName("user_id")val userId:String,
    @SerializedName("name")val userName:String,
    @SerializedName("gcn")val gcn:String,
    @SerializedName("github_url")val github:String,
    @SerializedName("email")val email:String,
    @SerializedName("image_path")val imagePath:String,
    @SerializedName("bio")val introduce:String,
    @SerializedName("clubs")val clubs:List<UserClubData>
)