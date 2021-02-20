package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.model.*
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("club/list")
    fun clublist(): Single<Response<Array<ClubData>>>

    @GET("club/{club_id}/info")
    fun clubInfo(
        @Path("club_id") club_id : String

    ): Single<ClubDetailData>

    @GET("club/{club_id}/recruitment")
    fun clubRecruit(
        @Path("club_id")  clubId: String
    ): Single<ClubRecruitData>

    @GET("club/{club_id}/member")
    fun clubMenber(
            @Path("club_id") clubId: String
    ): Single<ArrayList<ClubPersonData>>

    @GET("chat/list")
    fun chatList(
        @Header("Authorization") access_token : String
    ): Single<Response<ArrayList<ChatListData>>>

    @GET("feed/list")
    fun readFeed(
        @Header("Authorization")accessToken:String,
        @Query("page")page:String
    ):Single<Response<ArrayList<MainFeedData>>>

    @PUT("feed/{feed_id}/flag")
    fun flagClicked(
        @Header("Authorization")accessToken:String,
        @Path("feed_id")feed_id:String
    ):Single<Response<Any>>

    @GET("users/token")
    fun readToken(
        @Header("access-token")token:String
    ):Single<Response<TokensData>>

    @GET("users/refresh")
    fun readAccessToken(
        @Header("refresh-token")refreshToken:String
    ):Single<Response<AccessTokenData>>

    @GET("feed/{club_id}/list")
    fun readClubFeeds(
        @Header("Authorization")accessToken: String,
        @Query("page")page:String
    ):Single<Response<ArrayList<MainFeedData>>>
}