package com.example.tarea1_ap2.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor(){
    var quotes:List<QuoteModel> = emptyList()
}