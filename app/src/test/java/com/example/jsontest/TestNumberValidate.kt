package com.example.jsontest

import android.util.Log
import com.example.jsontest.model.DataNumberValidate
import com.google.gson.Gson
import org.junit.Assert
import org.junit.Test
import java.io.File

class TestNumberValidate{

    @Test
    fun toTestSubtract(){
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("NumberValidate.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataNumberValidate::class.java)
        data.subtractNumbers.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.a} and ${it.b}")
                val actual =  NumberValidate().subtractNumbers(it.a,it.b)
                Assert.assertEquals(expected, actual)
            }
        }
    }

    @Test
    fun toTestMultipleNumber(){
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("NumberValidate.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataNumberValidate::class.java)
        data.multipleNumbers.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.a} and ${it.b}")
                val actual =  NumberValidate().multipleNumbers(it.a,it.b)
                Assert.assertEquals(expected, actual)
            }
        }
    }


}