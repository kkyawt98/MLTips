package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Countered(
    @SerializedName("by_restrain_tips")
    val byRestrainTips: String,
    @SerializedName("heroid")
    val heroid: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String
)