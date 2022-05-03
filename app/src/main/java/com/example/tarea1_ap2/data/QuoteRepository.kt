package com.example.tarea1_ap2.data

import com.example.tarea1_ap2.data.model.QuoteModel
import com.example.tarea1_ap2.data.model.QuoteProvider
import com.example.tarea1_ap2.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val quoteProvider : QuoteProvider
){


    suspend fun getAllQuotes() : List<QuoteModel>{
        val response : List<QuoteModel> = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}