package com.example.tarea1_ap2.domain

import com.example.tarea1_ap2.data.QuoteRepository
import com.example.tarea1_ap2.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    suspend operator fun invoke():List<QuoteModel> = repository.getAllQuotes()
}