package com.a1appspoint.retrofittut

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a1appspoint.retrofittut.model.LabourDataItem
import kotlinx.coroutines.launch
import com.a1appspoint.retrofittut.repository.Repository
import retrofit2.Response

class MainViewModel(private val repository: Repository):ViewModel() {
    val myResponse: MutableLiveData<Response<List<LabourDataItem>>> = MutableLiveData()
   //val myResponseforSheet2 :MutableLiveData<Response<List<VendorAndAddressItem>>> = MutableLiveData()
    val myreponsep :MutableLiveData<Response<LabourDataItem>> = MutableLiveData()
    val myreponsepatch :MutableLiveData<Response<LabourDataItem>> = MutableLiveData()


    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }

    fun pushPost(labourDataItem: LabourDataItem){
        viewModelScope.launch {
            val response =repository.pushPost(labourDataItem)
            myreponsep.value =response
        }
        }

//    fun patchPost(labourDataItem: LabourDataItem, labourDataItem: LabourDataItem){
//        viewModelScope.launch {
//            val response =repository.putPost(labourDataItem,labourDataItem)
//            myreponsepatch.value =response
//        }
    }

//    fun getPostFromSheet2(){
//        viewModelScope.launch {
//            val response2 = repository.getPost2()
//            myResponseforSheet2.value = response2
//        }
//    }
//}