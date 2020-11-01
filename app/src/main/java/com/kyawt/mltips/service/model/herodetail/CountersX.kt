package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class CountersX(
    @SerializedName("heroid")
    val heroid: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("restrain_hero_tips")
    val restrainHeroTips: String
)