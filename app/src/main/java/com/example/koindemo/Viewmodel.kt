package com.example.koindemo

import androidx.lifecycle.ViewModel

class Viewmodel(val repository: Repository): ViewModel() {
    fun doNetworkCall(){
     repository.networkCall()
    }
}
