package com.projeto.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    // INTERCEPTAR MENSAGEM
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("RECEIVER", "BROACAST NORMAL");
        Toast.makeText(context, "Recebido", Toast.LENGTH_SHORT).show();
    }
}
