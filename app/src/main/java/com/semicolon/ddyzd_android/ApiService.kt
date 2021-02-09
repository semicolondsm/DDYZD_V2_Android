package com.semicolon.ddyzd_android

import com.semicolon.ddyzd_android.model.ClubData
import com.semicolon.ddyzd_android.model.ClubDetailData
import com.semicolon.ddyzd_android.model.ClubPersonData
import com.semicolon.ddyzd_android.model.ClubRecruitData
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.Query

interface ApiService {
    @GET("club/list")
    fun clublist(
    ): io.reactivex.Single<Array<ClubData>>

    @GET("club/{club_id}/info")
    fun clubInformation(
        @Query("club_id") clubId : String
    ): Call<ArrayList<ClubDetailData>>

    @GET("club/{club_id}/recruitment")
    fun clubRecruit(
            @Query("club_id")  clubId: String
    ): Call<ClubRecruitData>

    @GET("club/{club_id}/member")
    fun clubPersonData(
            @Query("club_id") clubId: String
    ): Call<ArrayList<ClubPersonData>>
}