package com.example.helloworld.broadcasts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ConnectivityChangeBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}