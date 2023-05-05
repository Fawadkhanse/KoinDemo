package com.example.koindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    val viewModel by viewModel<Viewmodel>()


    //injection in koin
    // when the class is create it will inject
    private val api = get<Api>()
    //lazy injection ..
    //it will inject when it used .
    private val api2 by  inject<Api>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}