package com.example.ping.model

import kotlinx.serialization.SerialName

data class News(

    val status: String,

    @SerialName("num_results")
    val numResults: Int,
    val results: List<NewsResults>

)
