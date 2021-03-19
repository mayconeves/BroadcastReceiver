package com.projeto.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEnviarNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviarNormal = findViewById(R.id.btnEnviarNormal);
        btnEnviarNormal.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnEnviarNormal:

                // ENVIAR BROADCAST
                Intent intent = new Intent(this, Receiver.class);
                sendBroadcast(intent);
                break;

        }

        Toast.makeText(this, "Intent Enviada", Toast.LENGTH_LONG).show();
    }

    public void enviarNormalBroadcast(View view) {

    }
}