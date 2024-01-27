package com.mahdi.mvicleancryptocurrency.data.remote

import com.squareup.moshi.Json

data class CoinDto(
    @field:Json(name = "data")
    val data: CoinListDto
)