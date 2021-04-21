package com.example.orgmarket.plugin.users.useCases

import com.example.orgmarket.feature.users.useCase.GetAllUsers
import com.example.orgmarket.feature.users.useCase.GetUsers

data class UseCases(
    val getUsers: GetUsers,
    val getAllUsers: GetAllUsers
)