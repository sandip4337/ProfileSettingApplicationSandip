package com.example.profilesettingsapp

import android.app.Application
import com.example.profilesettingsapp.RemoteDataSource.ProfileApi
import com.example.profilesettingsapp.RemoteDataSource.RetrofitBuilder
import com.example.profilesettingsapp.Repository.ProfileRepository

class ProfileApplication: Application() {
    lateinit var repository: ProfileRepository

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize(){

        val quoteService = RetrofitBuilder.getInstance().create(ProfileApi::class.java)

        repository = ProfileRepository(quoteService, applicationContext)

    }
}