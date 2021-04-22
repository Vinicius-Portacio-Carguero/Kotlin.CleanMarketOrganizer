package com.example.orgmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.BinderThread
import com.example.orgmarket.R
import com.example.orgmarket.feature.users.repository.UsersDataInterface
import com.example.orgmarket.feature.users.repository.UsersRepository
import com.example.orgmarket.feature.users.useCase.GetAllUsers
import com.example.orgmarket.plugin.users.gateway.UsersDataSource
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var getAllUseCase: UsersDataInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        getAllUseCase.getAll()

    }

}