package com.example.tarea1_ap2.domain

import com.example.tarea1_ap2.data.model.QuoteModel
import com.example.tarea1_ap2.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}