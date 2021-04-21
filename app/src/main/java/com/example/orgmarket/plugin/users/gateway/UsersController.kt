package com.example.orgmarket.plugin.users.gateway

import com.example.orgmarket.feature.users.data.Users
import com.example.orgmarket.plugin.retrofit.ApiPluginConnection
import com.example.orgmarket.plugin.retrofit.RetrofitService
import com.example.orgmarket.plugin.users.business.ApiSetup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsersController(private val service: ApiSetup) {

    companion object {

        var self: UsersController = UsersController(ApiSetup(ApiPluginConnection()))

    }

    fun getAll() {

        val callback = service.service().getAllUsers()
        callback.enqueue(object : Callback<List<Users>> {
            override fun onFailure(call: Call<List<Users>>, t: Throwable){
                print("")
            }

            override fun onResponse(call: Call<List<Users>>, response: Response<List<Users>>) {
                response.body()?.forEach{
                    println("%%% = ${it.email}")
                }
            }
        })

    }
}