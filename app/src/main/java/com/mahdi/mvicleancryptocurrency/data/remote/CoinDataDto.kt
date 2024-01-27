package com.mahdi.mvicleancryptocurrency.data.remote

import com.squareup.moshi.Json

data class CoinDataDto (
    @field:Json(name = "uuid")
    val uuid: String,
    @field:Json(name = "symbol")
    val symbol: String,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "color")
    val color: String,
    @field:Json(name = "iconUrl")
    val iconUrl: String,
    @field:Json(name = "marketCap")
    val marketCap: String,
    @field:Json(name = "price")
    val price: String,
    @field:Json(name = "listedAt")
    val listedAt: Int,
    @field:Json(name = "tier")
    val tier: Int,
    @field:Json(name = "change")
    val change: String,
    @field:Json(name = "rank")
    val rank: Int,
    @field:Json(name = "sparkline")
    val sparkline:List<String>,
    @field:Json(name = "lowVolume")
    val lowVolume: Boolean ,
    @field:Json(name = "coinrankingUrl")
    val coinrankingUrl: String  ,
    @field:Json(name = "_24hVolume")
    val _24hVolume: String  ,
    @field:Json(name = "btcPrice")
    val btcPrice: String  ,
)