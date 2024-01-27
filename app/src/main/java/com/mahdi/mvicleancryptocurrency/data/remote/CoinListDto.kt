package com.mahdi.mvicleancryptocurrency.data.remote

import com.squareup.moshi.Json

data class CoinListDto(
    @field:Json(name = "coins")
    val coinData: List<CoinDataDto>
)