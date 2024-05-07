package com.test.secureapikeywithndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initApiKeySecurity()
        val securedApiKey = getAPIKey()
        Toast.makeText(this, "API Key : $securedApiKey", Toast.LENGTH_LONG).show()
    }


    external fun getAPIKey() : String

    private fun initApiKeySecurity(){
        System.loadLibrary("api-keys")
    }
}