package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Skill(
    @SerializedName("item")
    val item: Item,
    @SerializedName("skill")
    val skill: List<SkillX>
)