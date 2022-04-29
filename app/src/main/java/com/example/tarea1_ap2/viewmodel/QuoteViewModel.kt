package com.example.tarea1_ap2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tarea1_ap2.model.QuoteModel
import com.example.tarea1_ap2.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}