package com.mahdi.mvicleancryptocurrency.data.remote

import retrofit2.http.GET

interface CoinListApi {

    @GET("coins")
    suspend fun getCoinData(): CoinDto
}