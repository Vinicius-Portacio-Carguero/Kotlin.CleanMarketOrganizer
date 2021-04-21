package com.example.orgmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orgmarket.R
import com.example.orgmarket.feature.users.repository.UsersDataInterface
import com.example.orgmarket.plugin.users.gateway.UsersDataSource
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")

//        UsersDataInterface.self.getAll()
    }

}