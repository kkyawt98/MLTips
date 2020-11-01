package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class HeroDetail(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String
)