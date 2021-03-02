package com.semicolon.ddyzd_android.model

data class ChatListData(val club_section: ArrayList<String>, val rooms : ArrayList<RoomData>)

data class RoomData(val roomid: String,
                    val id: String,
                    val name: String,
                    val image: String,
                    val lastdate : String?,
                    val lastmessage: String?,
                    val isRead : Boolean,
                    val index : Int)