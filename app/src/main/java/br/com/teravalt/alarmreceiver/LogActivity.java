package br.com.teravalt.alarmreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogActivity extends AppCompatActivity {

    public Intent intent = new Intent(this, Logger.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

    }

    public void iniciar(View view) {
        startService(intent);
    }

    public void parar(View view){
        stopService(intent);
    }
}
