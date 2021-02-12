package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.model.*
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("club/list")
    fun clublist(): Single<Array<ClubData>>

    @GET("club/{club_id}/info")
    fun clubInfo(
        @Path("club_id") club_id : String,
        @Query ("time")time : String
    ): Single<ClubDetailData>

    @GET("club/{club_id}/recruitment")
    fun clubRecruit(
            @Path("club_id")  clubId: String,
            @Query ("time")time : String
    ): Single<ClubRecruitData>

    @GET("club/{club_id}/member")
    fun clubMenber(
            @Path("club_id") clubId: String
    ): Single<ArrayList<ClubPersonData>>

    @GET("chat//list")
    fun chatList(
        @Header("refresh-token") refresh_token : String
    ): Single<ArrayList<ChatListData>>
}