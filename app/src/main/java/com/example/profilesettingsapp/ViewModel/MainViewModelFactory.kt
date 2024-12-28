package com.example.profilesettingsapp.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.profilesettingsapp.Repository.ProfileRepository

class MainViewModelFactory(private val repository: ProfileRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}