package com.mahdi.mvicleancryptocurrency.data.repository

import com.mahdi.mvicleancryptocurrency.data.mappers.toCoinInfo
import com.mahdi.mvicleancryptocurrency.data.remote.CoinListApi
import com.mahdi.mvicleancryptocurrency.domain.coins.CoinInfo
import com.mahdi.mvicleancryptocurrency.domain.repository.CoinsRepository
import com.mahdi.mvicleancryptocurrency.domain.util.Resource
import javax.inject.Inject


class CoinRepositoryImp @Inject constructor(private val api: CoinListApi) : CoinsRepository {
    override suspend fun getCoins(): Resource<CoinInfo> {
        return try {
            Resource.Success(
                data = api.getCoinData(
                ).toCoinInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message?:"An unknown error occurred.")
        }
    }
}