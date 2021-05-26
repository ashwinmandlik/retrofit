package com.a1appspoint.retrofittut.api

import com.a1appspoint.retrofittut.model.LabourDataItem
import retrofit2.Response
import retrofit2.http.*


interface SimpleApi {
    @GET("https://sheetdb.io/api/v1/igf9s2jchz4ow")
    suspend fun getPost(): Response<List<LabourDataItem>>

    @POST("https://sheetdb.io/api/v1/igf9s2jchz4ow")
    suspend fun pushPost(
        @Body post: LabourDataItem
        ):Response<LabourDataItem>


//   @FormUrlEncoded
//    @PUT("https://sheetdb.io/api/v1/igf9s2jchz4ow/search")
//    suspend fun putPost(@Path("phNo") phNo: LabourDataItem,
//                          @Body labourDataItem: LabourDataItem): Response<LabourDataItem>


}