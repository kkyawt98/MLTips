package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("battle_first")
    val battleFirst: BattleFirst,
    @SerializedName("battle_second")
    val battleSecond: BattleSecond,
    @SerializedName("main")
    val main: Main,
    @SerializedName("secondary")
    val secondary: Secondary,
    @SerializedName("tips")
    val tips: String
)