package com.a1appspoint.retrofittut

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import com.a1appspoint.retrofittut.model.LabourDataItem
import com.a1appspoint.retrofittut.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    @RequiresApi(Build.VERSION_CODES.O)
    private val dtf =DateTimeFormatter.ofPattern("HH/mm/ss")
    companion object {
        private const val TAG = "MainActivity"
    }
    

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val now = LocalTime.now()

        Log.i("abhikatime", dtf.format(now))

        val repository =Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
       // val mypost = LabourDataItem("testing","ashwin","10101010101","35","VENDOR")
        //viewModel.pushPost(mypost)
        val updatedata = LabourDataItem("android testing","arya","9548955457","34","updated")
      // val up = LabourDataItem()
      //  val phNo ="555"
//       viewModel.patchPost("9548955457","updated")
        //viewModel.

       // viewModel.getPost()


//        viewModel.myResponseforSheet2.observe(this){
//            if (it.isSuccessful){
//                val pOStatus = it.body()?.first()?.pOStatus.toString()
//                Log.i(TAG,pOStatus )
//            }
//        }

        viewModel.myResponse.observe(this , {response ->
            
            if (response.isSuccessful) {
                val sn = response.body()?.first()?.phNo.toString()
                CoroutineScope(Dispatchers.IO).launch {


                    withContext(Dispatchers.Main){

                    }
                }
                if (sn != null) {
                    Log.i("madarchod", sn)
                }else{
                    Log.i("Isnulll", "NUll")
                }
//                Log.d("response", response.body()?.!!)
//                Log.d("response", response.body()?.name!!)
//                Log.d("response", response.body()?.!!)
//                Log.d("response", response.body()?.phNo.toString())

            }

        })

    }



}
