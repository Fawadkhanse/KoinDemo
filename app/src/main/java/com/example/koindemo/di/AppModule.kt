package com.example.koindemo.di

import com.example.koindemo.Api
import com.example.koindemo.repo.Repository
import com.example.koindemo.repo.RepositoryImp
import com.example.koindemo.view.Viewmodel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
//singleton create only one instance
    single {
        Retrofit.Builder()
            .baseUrl("http://google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }
    //create new instance every time that request
    factory {

    }
    single<Repository>{
        //the repository need dependency  of Api Interface so it get() Function will proved it the above Retrofit.builder
        //this will inject well
        //but in repository we inject abstraction
        // for that we specify  that <Repository> or your interface
        RepositoryImp(get())
    }
    //view model scope is used for to inject view-model
   viewModel{
       Viewmodel(get())
   }

}