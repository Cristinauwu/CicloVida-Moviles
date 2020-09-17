package com.holamundocristina.proyectodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var logView: TextView

    private fun addLog(message: String){
        val text = logView.text
        logView.text = text.toString() + message + "\n"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logView = findViewById(R.id.logView)

        Log.d(TAG,"Se llamó OnCreate")

        addLog("Se llamó OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Se llamó OnStart")

        addLog("Se llamó OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Se llamó OnResume")

        addLog("Se llamó OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Se llamó OnPause")

        addLog("Se llamó OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Se llamó OnStop")

        addLog("Se llamó OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Se llamó OnDestroy")

        addLog("Se llamó OnDestroy")
    }
}