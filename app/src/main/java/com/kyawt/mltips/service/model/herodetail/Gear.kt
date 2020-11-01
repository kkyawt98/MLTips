package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Gear(
    @SerializedName("out_pack")
    val outPack: List<OutPack>,
    @SerializedName("out_pack_tips")
    val outPackTips: String,
    @SerializedName("verysix")
    val verysix: List<Any>
)