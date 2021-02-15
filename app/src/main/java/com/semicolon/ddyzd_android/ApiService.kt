package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.model.*
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.Path
import retrofit2.http.Query

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

    @GET("feed/list")
    fun readFeed(
        @Query("page")page:String
    ):Single<ArrayList<MainFeedData>>
}