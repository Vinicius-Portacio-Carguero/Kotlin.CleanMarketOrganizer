package com.example.orgmarket.feature.users.useCase

import com.example.orgmarket.feature.users.data.Users
import com.example.orgmarket.feature.users.repository.UsersRepository

class GetAllUsers(private val usersRepository: UsersRepository){
    suspend operator fun invoke(users: Users) = usersRepository.getAllUsers(users)
}