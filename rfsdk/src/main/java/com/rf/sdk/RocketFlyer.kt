package com.rf.sdk

import android.content.Context
import androidx.annotation.Keep
import com.rf.sdk.util.RFLog

@Keep
class RocketFlyer private constructor(){

    @Keep
    companion object {
        private val rocketFlyerInst = RocketFlyer()

        /**
         *  Call this method in onCreate method of Application class
         */
        @JvmStatic
        fun initializeRocketFlyer(context: Context) {
            RocketFlyerBuilder.initialize(context)
        }

        /**
         *  Get RocketFlyer SDK Instance
         */
        @JvmStatic
        fun getInstance(): RocketFlyer {
            if (!isInitialized()) {
                throw Exception("RocketFlyer is not initialized.")
            }
            return rocketFlyerInst
        }

        /**
         * Checks if RocketFlyer SDK is initialized.
         * */
        @JvmStatic
        fun isInitialized(): Boolean = RocketFlyerBuilder.getRFInstance() != null

        /**
         *  call to initialize
         */
        fun initialize(token: String) {
            RocketFlyerBuilder.getRFInstance()!!.initialize(token)
        }

        /**
         *  call to start
         */
       fun start(processId: String, taskId: String?) {
           RocketFlyerBuilder.getRFInstance()!!.start(processId,taskId)
        }

        /**
         *  call to start without taskId
         */
        fun start(processId: String) {
            RocketFlyerBuilder.getRFInstance()!!.start(processId,null)
        }

        /**
         *  call to terminate
         */
        fun terminate() {
            RocketFlyerBuilder.getRFInstance()!!.terminate()
        }

    }
}