package com.test.task

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.test.task.utils.TAG
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EventBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        Log.d(TAG, "onReceive")
    }
}