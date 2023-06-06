package com.example.jsontest

import android.util.Log
import com.example.jsontest.model.DataArithmeticOperations
import com.google.gson.Gson
import org.junit.Assert.*

import org.junit.Test
import java.io.File

class TestArithmeticOperations {

    @Test
    fun divisionNumbers() {
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("ArithmeticOperations.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataArithmeticOperations::class.java)
        data.divisionNumbers.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.a} and ${it.b}")
                val actual = arithmeticOperations().divisionNumbers(it.a,it.b)
                assertEquals(expected, actual)
            }
        }
    }

    @Test
    fun greaterNumbers() {
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("ArithmeticOperations.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataArithmeticOperations::class.java)
        data.greaterNumbers.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.a} and ${it.b}")
                val actual = arithmeticOperations().greaterNumbers(it.a,it.b)
                assertEquals(expected, actual)
            }
        }
    }
}