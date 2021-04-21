package com.example.orgmarket.plugin.retrofit


import retrofit2.Retrofit

class ApiPluginConnection() {

    fun getRetrofitClient(): Retrofit{
        val retrofitClient =
            RetrofitService
                .getRetrofitService("https://jsonplaceholder.typicode.com/")

        return retrofitClient
    }
}