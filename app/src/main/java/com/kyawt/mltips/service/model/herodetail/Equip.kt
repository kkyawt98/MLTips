package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Equip(
    @SerializedName("des")
    val des: List<String>,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String
)