package com.matchaffinity.codingchallenge.model

import com.google.gson.annotations.SerializedName

data class Author(
        @SerializedName("login") val name: String
)