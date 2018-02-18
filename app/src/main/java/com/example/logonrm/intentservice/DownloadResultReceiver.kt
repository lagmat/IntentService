package com.example.logonrm.intentservice

import android.os.Bundle
import android.os.ResultReceiver
import android.os.Handler
import javax.sound.midi.Receiver

/**
 * Created by Lagmat on 18/02/2018.
 */
class DownloadResultReceiver (handler: Handler): ResultReceiver(handler){
    private var mReceiver: Receiver? = null
    fun setReceiver(receiver: Receiver){
        mReceiver = receiver
    }

    interface Receiver{
        fun onReceiverResult(resultCode: Int, resultData: Bundle)
    }

    override fun onReceiveResult(resultCode: Int, resultData: Bundle) {
        if (mReceiver != null){
            mReceiver!!.onReceiverResult(resultCode, resultData)
        }
    }
}