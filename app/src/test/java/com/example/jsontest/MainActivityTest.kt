package com.example.jsontest

import android.os.Looper
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import org.robolectric.Robolectric

class MainActivityTest {

//    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
//        mainActivity = MainActivity()
    }

    @Test
    fun add() {
        // Create an instance of MainActivity using Robolectric
        val mainActivity = Robolectric.setupActivity(MainActivity::class.java)

        // Call the function you want to test
        val result = mainActivity.add(2, 3)
        assertEquals(5, result)
    }
}