package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Best(
    @SerializedName("best_mate_tips")
    val bestMateTips: String,
    @SerializedName("heroid")
    val heroid: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String
)