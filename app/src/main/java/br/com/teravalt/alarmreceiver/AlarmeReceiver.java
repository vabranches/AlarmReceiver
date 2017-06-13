package br.com.teravalt.alarmreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by logonrm on 12/06/2017.
 */

public class AlarmeReceiver extends BroadcastReceiver {
    private MediaPlayer mediaPlayer = null;

    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context, R.raw.navi);
        mediaPlayer.start();
        Toast.makeText(context, "Alarme", Toast.LENGTH_LONG).show();

    }
}
