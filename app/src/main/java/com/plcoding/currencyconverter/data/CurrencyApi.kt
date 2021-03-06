package com.plcoding.currencyconverter.data

import com.plcoding.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest?access_key=95534d572d699dec87140e0e8e1616e0")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}