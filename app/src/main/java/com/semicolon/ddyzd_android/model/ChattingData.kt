package com.semicolon.ddyzd_android.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class ChattingData(
    val title: String, val msg: String,
    @SerializedName("result")
    val result: Boolean?, val user_type: String, val created_at: String?)