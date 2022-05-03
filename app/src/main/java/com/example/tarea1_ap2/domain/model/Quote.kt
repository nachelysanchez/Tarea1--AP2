package com.example.tarea1_ap2.domain.model

import com.example.tarea1_ap2.data.database.entities.QuoteEntity
import com.example.tarea1_ap2.data.model.QuoteModel

data class Quote(val quote: String, val author: String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)