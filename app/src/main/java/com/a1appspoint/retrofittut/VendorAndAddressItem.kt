package com.a1appspoint.retrofittut


import com.google.gson.annotations.SerializedName

data class VendorAndAddressItem(
    @SerializedName("Address")
    val address: String,
    @SerializedName("Customer Name")
    val customerName: String,
    @SerializedName("Lati & Longi")
    val latiLongi: String,
    @SerializedName("PO Status")
    val pOStatus: String,
    @SerializedName("Project ID")
    val projectID: String,
    @SerializedName("Sn")
    val sn: String,
    @SerializedName("Vendor Name")
    val vendorName: String
)