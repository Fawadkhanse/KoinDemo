package com.example.koindemo

import retrofit2.http.GET

interface Api {
    @GET("api/myEndPoint")
    fun apiCall()
}