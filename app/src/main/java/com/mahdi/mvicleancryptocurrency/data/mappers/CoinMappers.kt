package com.mahdi.mvicleancryptocurrency.data.mappers


import com.mahdi.mvicleancryptocurrency.data.remote.CoinDataDto
import com.mahdi.mvicleancryptocurrency.data.remote.CoinDto
import com.mahdi.mvicleancryptocurrency.domain.coins.CoinData
import com.mahdi.mvicleancryptocurrency.domain.coins.CoinInfo


fun CoinDataDto.toCoinData(): CoinData {
    return CoinData(
        symbol,
        name,
        color,
        iconUrl, marketCap,
        price,
        _24hVolume,
        rank, sparkline, btcPrice

    )

}

fun CoinDto.toCoinInfo(): CoinInfo {
    var listOfCoinData = ArrayList<CoinData>()
    var data = data.coinData

    for (coinDatum in data) {
        var coin = coinDatum.toCoinData()
        listOfCoinData.add(coin)
    }
    return CoinInfo(listOfCoinData)
}
