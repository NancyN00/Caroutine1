package com.example.coroutines1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //the two lines will be executed separately because one is run inside the onCreate and
        //the other is run inside the coroutine
        GlobalScope.launch{

            delay(5000L)
            Log.d(TAG, "Coroutine says hello from thread ${Thread.currentThread().name}")
        }

        Log.d(TAG, "hello from thread ${Thread.currentThread().name}")
    }
}