package com.example.tarea1_ap2.domain

import com.example.tarea1_ap2.data.model.QuoteModel
import com.example.tarea1_ap2.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider : QuoteProvider
) {
    operator fun invoke(): QuoteModel?{
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}