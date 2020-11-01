package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Counters(
    @SerializedName("best")
    val best: Best,
    @SerializedName("countered")
    val countered: Countered,
    @SerializedName("counters")
    val counters: CountersX
)