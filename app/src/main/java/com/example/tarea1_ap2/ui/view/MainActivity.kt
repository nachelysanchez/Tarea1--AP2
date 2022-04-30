package com.example.tarea1_ap2.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.tarea1_ap2.databinding.ActivityMainBinding
import com.example.tarea1_ap2.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }

    }
}