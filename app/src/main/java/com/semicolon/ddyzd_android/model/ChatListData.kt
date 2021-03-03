package com.semicolon.ddyzd_android.model

data class ChatListData(val club_section: ArrayList<String>, val rooms : ArrayList<RoomData>)

data class RoomData(
                    val id: String,
                    val image: String,
                    val index : Int,
                    val isread : Boolean,
                    val lastdate : String?,
                    val lastmessage: String?,
                    val name: String,
                    val roomid: String,
                    val status : String)