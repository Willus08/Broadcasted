package com.example.android.broadcasted;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Intent recived = new Intent();
        String s = recived.getStringExtra("name");
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();

    }
}
