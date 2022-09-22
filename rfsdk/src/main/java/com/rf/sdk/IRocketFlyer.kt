package com.rf.sdk

import android.content.Context

internal interface  IRocketFlyer {
    fun initialize( token: String)
    fun start(processId: String, taskId : String?)
    fun terminate()
}