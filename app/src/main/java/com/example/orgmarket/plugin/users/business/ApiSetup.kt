package com.example.orgmarket.plugin.users.business

import com.example.orgmarket.plugin.UsersAPI
import com.example.orgmarket.plugin.retrofit.ApiPluginConnection

class ApiSetup(private val service: ApiPluginConnection) {

    fun service() : UsersAPI {
        val createAPIservice = service
            .getRetrofitClient()
            .create(UsersAPI::class.java)

        return createAPIservice
    }

}