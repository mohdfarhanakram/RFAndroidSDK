package com.rf.androidsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rf.sdk.RocketFlyer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initialize(view: View) {
        RocketFlyer.initialize("xfdrdxfxxffxfxfxffx") // testing token
    }

    fun start(view: View) {
        RocketFlyer.start("1023333") // testing token
    }
    fun terminate(view: View) {
        RocketFlyer.terminate() // terminate
    }
}