package com.rf.sdk

import android.content.Context
import android.widget.Toast
import com.rf.sdk.util.RFLog
import java.lang.ref.WeakReference

internal class RocketFlyerImp(
    context: Context
) : IRocketFlyer{
    private val contextRef = WeakReference(context.applicationContext)
    override fun initialize(token: String) {
        contextRef.get()?.let {
            if (token.isEmpty()) throw Exception("Token cannot be null")
            RFLog.d("Token value : $token")
            showToast(it,"Initialized : Token value : $token");
        }
    }

    override fun start(processId: String, taskId: String?) {
        contextRef.get()?.let {
            if (processId.isEmpty()) throw Exception("ProcessId cannot be null")
            RFLog.d("ProcessId : $processId")
            showToast(it,"Started : ProcessId : $processId");
        }
    }

    override fun terminate() {
        contextRef.get()?.let {
            RFLog.d("Terminate")
            showToast(it,"Terminate");
        }
    }


    private fun showToast(context: Context, str : String){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }

}