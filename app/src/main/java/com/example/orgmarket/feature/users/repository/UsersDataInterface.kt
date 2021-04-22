package com.example.orgmarket.feature.users.repository

import com.example.orgmarket.feature.users.data.Users

interface UsersDataInterface {

    companion object {
        var self = UsersDataInterface
    }

    fun getAll(): Unit

    suspend fun get(id: Long): Users?
}