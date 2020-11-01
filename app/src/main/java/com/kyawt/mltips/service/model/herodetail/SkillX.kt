package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class SkillX(
    @SerializedName("des")
    val des: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("tips")
    val tips: String
)