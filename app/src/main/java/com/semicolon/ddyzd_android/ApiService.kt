package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.model.*
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("club/list")
    fun clublist(): Single<Array<ClubData>>

    @GET("club/{club_id}/info")
    fun clubInfo(
        @Query ("time")time : String,
        @Path("club_id") club_id : String

    ): Single<ClubDetailData>

    @GET("club/{club_id}/recruitment")
    fun clubRecruit(
        @Query ("time")time : String,
        @Path("club_id")  clubId: String
    ): Single<ClubRecruitData>

    @GET("club/{club_id}/member")
    fun clubMenber(
            @Path("club_id") clubId: String
    ): Single<ArrayList<ClubPersonData>>

    @GET("chat//list")
    fun chatList(
        @Query("time")time : Long,
        @Header("access-token") access_token : String
    ): Single<Response<ArrayList<ChatListData>>>

}