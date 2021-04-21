package com.example.orgmarket.feature.users.repository

import com.example.orgmarket.feature.users.data.Users

interface UsersDataInterface {

    suspend fun getAll(): List<Users>

    suspend fun get(id: Long): Users?
}