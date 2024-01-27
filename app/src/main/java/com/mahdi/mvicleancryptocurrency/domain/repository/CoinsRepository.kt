package com.mahdi.mvicleancryptocurrency.domain.repository

import com.mahdi.mvicleancryptocurrency.domain.coins.CoinInfo
import com.mahdi.mvicleancryptocurrency.domain.util.Resource

interface CoinsRepository {
    suspend fun getCoins(): Resource<CoinInfo>
}