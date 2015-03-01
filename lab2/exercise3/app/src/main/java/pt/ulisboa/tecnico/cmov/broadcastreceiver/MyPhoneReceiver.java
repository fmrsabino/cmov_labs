package pt.ulisboa.tecnico.cmov.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyPhoneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String incomingNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Log.w("MyPhoneReceiver", incomingNumber);
    }
}
