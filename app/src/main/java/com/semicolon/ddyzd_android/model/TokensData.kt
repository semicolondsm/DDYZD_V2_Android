package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName

data class TokensData(
    @SerializedName("access_token") val accessToken: String,
    @SerializedName("refresh_token") val refreshToken: String
)