package com.semicolon.ddyzd_android.model

data class ClubData(
    val clubid: String,
    val clubname: String,
    val clubtag: ArrayList<String>,
    val clubimage: String,
    val backimage: String?,
    val clubdescription: String,
    val clubrecruitment:Boolean
)