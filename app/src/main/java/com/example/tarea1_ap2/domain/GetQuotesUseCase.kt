package com.example.tarea1_ap2.domain

import com.example.tarea1_ap2.data.QuoteRepository
import com.example.tarea1_ap2.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository) {
    suspend operator fun invoke():List<QuoteModel> = repository.getAllQuotes()
}