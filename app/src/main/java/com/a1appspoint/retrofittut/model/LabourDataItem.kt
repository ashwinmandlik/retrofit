package com.a1appspoint.retrofittut.model


import com.google.gson.annotations.SerializedName

data class LabourDataItem(
    val category: String,
    val name: String,
    val phNo: String,
    val sn: String,
   // @SerializedName("vendorName ")
    val vendorName: String
//    val userId: Int,
//    val id: Int,
//    val title: String,
//    val body: String
)