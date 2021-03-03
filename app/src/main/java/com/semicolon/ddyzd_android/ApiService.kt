package com.semicolon.ddyzd_android

<<<<<<< HEAD
import com.semicolon.ddyzd_android.model.ChatData
import com.semicolon.ddyzd_android.model.ClubData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.Query

interface ApiService {
    @GET("club/list")
    fun clublist(
    ): Call<ArrayList<ClubData>>
    
=======
import com.google.gson.annotations.SerializedName
import com.semicolon.ddyzd_android.model.*
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("club/list")
    fun clublist(): Single<Response<Array<ClubData>>>

    @GET("club/{club_id}/recruitment")
    fun clubRecruit(
        @Path("club_id") clubId: String,
        @Header("Authorization") accessToken: String
    ): Single<Response<ClubRecruitData>>

    @GET("club/{club_id}/member")
    fun clubMember(
        @Header("Authorization") accessToken: String,
        @Path("club_id") clubId: String
    ): Single<Response<ArrayList<MembersData>>>

    @GET("chat/list")
    fun chatList(
        @Header("Authorization") access_token: String
    ): Single<Response<ChatListData>>

    @GET("feed/list")
    fun readFeed(
        @Header("Authorization") accessToken: String,
        @Query("page") page: String,
        @Query("time") time: String
    ): Single<Response<ArrayList<MainFeedData>>>

    @PUT("feed/{feed_id}/flag")
    fun flagClicked(
        @Header("Authorization") accessToken: String,
        @Path("feed_id") feed_id: String
    ): Single<Response<Any>>

    @GET("users/token")
    fun readToken(
        @Header("access-token") token: String
    ): Single<Response<TokensData>>

    @GET("users/refresh")
    fun readAccessToken(
        @Header("refresh-token") refreshToken: String
    ): Single<Response<AccessTokenData>>
    @GET("feed/{club_id}/list")
    fun readClubFeeds(
        @Header("Authorization") accessToken: String,
        @Path("club_id")clubId: String,
        @Query("page") page: Int,
        @Query("time") time: String
    ): Single<Response<ArrayList<MainFeedData>>>

    @GET("club/{club_id}/info")
    fun readClubInfo(
        @Header("Authorization") accessToken: String?,
        @Path("club_id") club_id: Int,
        @Query("time") time: String
    ): Single<Response<ClubInDetailData>>

    @POST("club/{club_id}/follow")
    fun doFollow(
        @Header("Authorization")accessToken: String,
        @Path("club_id")clubId: String
    ):Single<Response<Any>>

    @DELETE("club/{club_id}/follow")
    fun unFollow(
        @Header("Authorization")accessToken: String,
        @Path("club_id")clubId: String
    ):Single<Response<Any>>

    @POST("chat/{club_id}/room")
    fun makeChatRoom(
        @Header("Authorization")accessToken: String,
        @Path("club_id")clubId: String
    ):Single<Response<RoomIdData>>

    @DELETE("feed/{feed_id}")
    fun deleteFeed(
        @Header("Authorization")accessToken: String,
        @Path("feed_id")feedId:Int
    ):Single<Response<Any>>

    @POST("feed/{club_id}")
    fun addClubFeed(
        @Header("Authorization")accessToken: String,
        @Body content:String
    ):Single<Response<AddFeedData>>

    @GET("users/{user_gcn}")
    fun readUserInfo(
        @Header("Authorization")accessToken: String?,
        @Path("user_gcn")gcn:String
    ):Single<Response<UserInfoData>>

    @GET("chat/{room_id}/breakdown")
    fun getChatting(
        @Path("room_id")roomId:String,
        @Header("Authorization")accessToken: String
    ):Single<Response<ArrayList<ChattingData>>>

    @PUT("users/profile/bio")
    fun modifyUserIntro(
        @Header("Authorization")accessToken: String,
        @Body bio:MutableMap<String,String?>
    ):Single<Response<Any>>

    @PUT("users/profile/git")
    fun editGithub(
        @Header("Authorization")accessToken: String,
        @Body git:MutableMap<String,String?>
    ):Single<Response<Any>>

    @POST("users/device_token")
    fun addDeviceToken(
        @Header("Authorization")accessToken: String,
        @Header("device-token")token:String
    ):Single<Response<Any>>

    @GET("room/{room_id}/token")
    fun getRoomToken(
        @Header("Authorization")accessToken: String,
        @Path("room_id")roomId : String
    ):Single<Response<RoomTokenData>>
>>>>>>> 1f0b0f0536823e18847abea9a353e2f618a4ae36
}