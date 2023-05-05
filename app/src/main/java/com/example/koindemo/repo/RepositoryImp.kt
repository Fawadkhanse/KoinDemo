package com.example.koindemo.repo

import com.example.koindemo.Api

class RepositoryImp(val api: Api): Repository {
    override fun networkCall() {
        api.apiCall()
    }
}