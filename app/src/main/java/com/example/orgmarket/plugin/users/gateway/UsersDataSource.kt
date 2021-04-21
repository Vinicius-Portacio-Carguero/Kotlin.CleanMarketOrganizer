package com.example.orgmarket.plugin.users.gateway

import android.content.Context
import com.example.orgmarket.feature.users.data.Users
import com.example.orgmarket.feature.users.repository.UsersDataInterface

class UsersDataSource(private val controller: UsersController): UsersDataInterface{

    override suspend fun getAll(): List<Users> = controller.getAll()

    override suspend fun get(id: Long): Users? {
        TODO("Not yet implemented")
    }

}