package com.example.service_application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private  Button button, start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.button1);
        stop = findViewById(R.id.button2);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    public void onClick (View view)
    {
        if (view==start)
        {
            startService(new Intent(this, NewService.class));

        }
        else if(view==stop)
        {
            stopService(new Intent(this, NewService.class));
        }
    }
}