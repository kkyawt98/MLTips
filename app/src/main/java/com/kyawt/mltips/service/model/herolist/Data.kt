package com.kyawt.mltips.service.model.herolist

import com.google.gson.annotations.SerializedName

data class Data(
        @SerializedName("heroid")
        val heroid: String,
        @SerializedName("key")
        val key: String,
        @SerializedName("name")
        val name: String
)