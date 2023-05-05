package com.example.koindemo

class RepositoryImp(val api: Api):Repository {
    override fun networkCall() {
        api.apiCall()
    }
}