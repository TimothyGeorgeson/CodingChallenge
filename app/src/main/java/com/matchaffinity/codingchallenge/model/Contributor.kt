package com.matchaffinity.codingchallenge.model

import com.google.gson.annotations.SerializedName

data class Contributor(
        @SerializedName("total") val commits: Int,
        @SerializedName("author") val author: Author )