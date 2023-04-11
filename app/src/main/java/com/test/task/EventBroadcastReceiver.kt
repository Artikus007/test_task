package com.test.task

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.util.Log
import com.test.task.utils.TAG
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class EventBroadcastReceiver
@Inject
constructor() : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        Log.d(TAG, "onReceive")
    }

    fun register(context: Context) {
        context.registerReceiver(this, IntentFilter(WifiManager.NETWORK_STATE_CHANGED_ACTION))
    }
}