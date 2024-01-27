package com.mahdi.mvicleancryptocurrency.domain.coins

import java.time.LocalDateTime

data class CoinData(
    val symbol: String,
    val name: String,
    val color: String,
    val iconUrl: String,
    val marketCap: String,
    val price: String,
    val _24hVolume: String,
    val rank: Int,
    val sparkline: List<String>,
    val btcPrice: String,
)