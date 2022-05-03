package com.example.tarea1_ap2.domain

import com.example.tarea1_ap2.data.QuoteRepository
import com.example.tarea1_ap2.data.model.QuoteModel
import com.example.tarea1_ap2.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: QuoteRepository
) {
    suspend operator fun invoke(): Quote?{
        val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}