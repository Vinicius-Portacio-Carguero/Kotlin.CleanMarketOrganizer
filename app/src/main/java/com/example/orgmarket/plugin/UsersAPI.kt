package com.example.orgmarket.plugin

import com.example.orgmarket.feature.users.data.Users
import retrofit2.Call
import retrofit2.http.GET

interface UsersAPI {
    @GET("users")
    fun getAllUsers(): Call<List<Users>>

}