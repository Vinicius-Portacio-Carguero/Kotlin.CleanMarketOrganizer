package com.example.orgmarket.feature.users.repository

import com.example.orgmarket.feature.users.data.Users

class UsersRepository(private val dataInterface: UsersDataInterface){

    suspend fun getAllUsers(users: Users) = dataInterface.getAll()

    suspend fun getUsers(id: Long) = dataInterface.get(id)
}