package com.example.profilesettingsapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.profilesettingsapp.Repository.ProfileRepository
import com.example.profilesettingsapp.data.ProfileDetails
import com.example.profilesettingsapp.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProfileRepository) : ViewModel(){

    init {

        viewModelScope.launch(Dispatchers.IO) {

            repository.getProfileDetails("378")

        }
    }

    val profileDetails : LiveData<NetworkResult<ProfileDetails>> get() = repository.profileDetails

}