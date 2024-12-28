package com.example.profilesettingsapp.RemoteDataSource

import com.example.profilesettingsapp.data.ProfileDetails
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface ProfileApi {

    @POST("/g-mee-api/api/v1/apps/list")
    suspend fun getProfileDetails(@Query("kid_id") kid_id:String): Response<ProfileDetails>

}