package com.example.netologycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG: String = "onCreateFunction"
    val ErrorTAG: String = "onCreateError"
    val WarningTAG: String = "onCreateWarning"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w(WarningTAG, "The variables are about to be declared and initialized!")

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        var age: Int = 37
        var height: Double = 172.2
        var text: String = "name: $name surname: $surname age: $age height: $height"
        var textView :TextView = findViewById(R.id.output)

        textView.text = text

        Log.d(TAG, "end of onCreate function")
        Log.e(ErrorTAG, "I am an error, I am located the end of the program to not bother anyone")
    }
}