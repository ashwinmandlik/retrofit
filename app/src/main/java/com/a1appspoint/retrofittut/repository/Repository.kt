package com.a1appspoint.retrofittut.repository

import com.a1appspoint.retrofittut.model.LabourDataItem
import com.a1appspoint.retrofittut.api.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<List<LabourDataItem>> {
        return RetrofitInstance.api.getPost()
    }


    suspend fun pushPost(labourDataItem: LabourDataItem): Response<LabourDataItem> {
        return RetrofitInstance.api.pushPost(labourDataItem)
    }

//    suspend fun putPost(labourDataItem: LabourDataItem): Response<LabourDataItem> {
//
//        return RetrofitInstance.api.putPost(labourDataItem,labourDataItem)
//
//    }
//    suspend fun getPost2():Response<List<VendorAndAddressItem>>{
//        return RetrofitInstance.api.getPostFromSheet2("Sheet2")
//    }

}




