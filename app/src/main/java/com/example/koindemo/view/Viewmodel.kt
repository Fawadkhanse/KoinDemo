package com.example.koindemo.view

import androidx.lifecycle.ViewModel
import com.example.koindemo.repo.Repository

class Viewmodel(val repository: Repository): ViewModel() {
    fun doNetworkCall(){
     repository.networkCall()
    }
}
