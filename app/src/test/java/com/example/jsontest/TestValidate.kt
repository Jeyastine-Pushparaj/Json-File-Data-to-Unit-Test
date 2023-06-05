package com.example.jsontest

import android.util.Log
import com.example.jsontest.model.DataValidate
import com.example.jsontest.model.PerformLogin
import com.google.gson.Gson
import com.unittest.testexample.model.LoginCredentials
import org.junit.Assert.*

import org.junit.Test
import java.io.File

class TestValidate {

    @Test
    fun performLogin() {
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("Validate.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataValidate::class.java)
        data.performLogin.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.userName} and ${it.password}")
                val actual = Validate().performLogin(it.userName,it.password)
                assertEquals(expected, actual)
            }
        }
    }

    @Test
    fun addNumbers() {
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("Validate.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataValidate::class.java)
        data.addNumbers.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.a} and ${it.b}")
                val actual = Validate().addNumbers(it.a,it.b)
                assertEquals(expected, actual)
            }
        }
    }

    @Test
    fun addStrings() {
        val classLoader = javaClass.classLoader
        val url = classLoader?.getResource("Validate.json")
        val file = url?.file?.let { File(it) }
        val json = file?.readText()
        val data =  Gson().fromJson(json, DataValidate::class.java)
        data.addStrings.forEach {
            val expected = it.outPut
            it.Input.forEach {
                Log.d("Check", "Data : ${it.str1} and ${it.str2}")
                val actual = Validate().addStrings(it.str1,it.str2)
                assertEquals(expected, actual)
            }
        }
    }
}