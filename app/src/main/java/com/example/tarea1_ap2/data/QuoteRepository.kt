package com.example.tarea1_ap2.data

import com.example.tarea1_ap2.data.database.dao.QuoteDao
import com.example.tarea1_ap2.data.database.entities.QuoteEntity
import com.example.tarea1_ap2.data.model.QuoteModel
import com.example.tarea1_ap2.data.model.QuoteProvider
import com.example.tarea1_ap2.data.network.QuoteService
import com.example.tarea1_ap2.domain.model.Quote
import com.example.tarea1_ap2.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val quoteDao: QuoteDao
){


    suspend fun getAllQuotesFromApi() : List<Quote>{
        val response= api.getQuotes()
        return response.map{it.toDomain()}
    }

    suspend fun getAllQuotesFromDatabase() : List<Quote>{
        val response:List<QuoteEntity> = quoteDao.getAllQuotes()
        return response.map{it.toDomain()}
    }

}