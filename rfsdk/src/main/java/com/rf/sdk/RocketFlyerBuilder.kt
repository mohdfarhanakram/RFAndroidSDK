package com.rf.sdk

import android.content.Context
import android.util.Log
import com.rf.sdk.util.RFLog

internal object  RocketFlyerBuilder {

    private var iRocketFlyer: IRocketFlyer? = null

    fun initialize(context: Context) {
        if (RocketFlyer.isInitialized()) {
            RFLog.d("RF Already initialized")
            return
        }

        if(iRocketFlyer==null){
            iRocketFlyer = RocketFlyerImp(context)
        }
    }

    fun getRFInstance(): IRocketFlyer? = iRocketFlyer

}