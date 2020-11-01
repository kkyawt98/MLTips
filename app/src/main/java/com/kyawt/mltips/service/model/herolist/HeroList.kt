package com.kyawt.mltips.service.model.herolist
import com.google.gson.annotations.SerializedName

data class HeroList(
        @SerializedName("code")
    val code: Int,
        @SerializedName("data")
    val `data`: List<Data>,
        @SerializedName("message")
    val message: String
)