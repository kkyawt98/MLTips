package com.kyawt.mltips.service.model.herodetail


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("alive")
    val alive: String,
    @SerializedName("cost")
    val cost: String,
    @SerializedName("counters")
    val counters: Counters,
    @SerializedName("cover_picture")
    val coverPicture: String,
    @SerializedName("des")
    val des: String,
    @SerializedName("diff")
    val diff: String,
    @SerializedName("gallery_picture")
    val galleryPicture: String,
    @SerializedName("gear")
    val gear: Gear,
    @SerializedName("junling")
    val junling: String,
    @SerializedName("mag")
    val mag: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phy")
    val phy: String,
    @SerializedName("skill")
    val skill: Skill,
    @SerializedName("type")
    val type: String
)