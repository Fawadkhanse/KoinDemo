package com.example.koindemo

import android.app.Application
import com.example.koindemo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        //init the koin
        startKoin {
            androidContext( this@MyApplication)
            modules(appModule)
        }
    }
}
