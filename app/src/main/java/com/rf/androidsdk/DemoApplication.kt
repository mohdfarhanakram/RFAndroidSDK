package com.rf.androidsdk

import android.app.Application
import com.rf.sdk.RocketFlyer

class DemoApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        RocketFlyer.initializeRocketFlyer(this)
    }
}