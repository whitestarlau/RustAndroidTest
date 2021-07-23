package com.example.rustandroidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.rust.RustTest

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityTAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.testRustBtn).setOnClickListener {
            testRustLib()
        }
    }

    fun testRustLib(){
        RustTest.startRequestFromJni(object : RustTest.Callback {
            override fun startCall() {
                Log.d(TAG, "startCall")
            }

            override fun getResult(str: String?) {
                Log.d(TAG, "getResult: ${str}")
            }
        })
    }
}