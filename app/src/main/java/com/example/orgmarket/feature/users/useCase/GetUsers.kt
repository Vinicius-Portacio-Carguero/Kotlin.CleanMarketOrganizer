package com.example.orgmarket.feature.users.useCase

import com.example.orgmarket.feature.users.data.Users
import com.example.orgmarket.feature.users.repository.UsersRepository

class GetUsers(private val usersRepository: UsersRepository) {
    suspend operator fun invoke(id: Long) = usersRepository.getUsers(id)
}