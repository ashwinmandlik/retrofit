package com.a1appspoint.retrofittut.api

import com.a1appspoint.retrofittut.utils.Constants.Companion.BASE_URL
//import com.a1appspoint.retrofittut.utils.Constants.Companion.BASE_URL2
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {

       Retrofit.Builder()
           .baseUrl("https://sheetdb.io/api/v1/igf9s2jchz4ow/")
           .addConverterFactory(GsonConverterFactory.create())
           .build()

    }
    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }

}
