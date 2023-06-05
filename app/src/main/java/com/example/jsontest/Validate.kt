package com.example.jsontest

import android.util.Log
import android.widget.Toast

class Validate {

     fun performLogin(username: String, password: String): String {
         return if (username == "admin" && password == "password") {
             Log.d("TAG", "performLogin: VALID")
             "Valid"
         } else {
             Log.d("TAG", "performLogin: INVALID")
             "InValid"
         }
    }

    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun addStrings(str1:String,str2:String):String {
        return str1 + str2
    }
}