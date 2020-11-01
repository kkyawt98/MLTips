package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class OutPack(
    @SerializedName("equip")
    val equip: Equip,
    @SerializedName("equipment_id")
    val equipmentId: String
)