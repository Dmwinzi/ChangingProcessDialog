package com.example.changingprocessdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changedialog = findViewById(R.id.changedialog);
        ProgressBar progressBar1,progressBar2,progressBar3;

        progressBar1 = findViewById(R.id.red);
        progressBar2 = findViewById(R.id.blue);
        progressBar3 = findViewById(R.id.green);

        progressBar1.setVisibility(View.INVISIBLE);
        progressBar2.setVisibility(View.INVISIBLE);
        progressBar3.setVisibility(View.INVISIBLE);

        changedialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar1.setVisibility(View.VISIBLE);

                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar1.setVisibility(View.INVISIBLE);
                        progressBar2.setVisibility(View.VISIBLE);
                    }
                },4000);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar2.setVisibility(View.INVISIBLE);
                        progressBar3.setVisibility(View.VISIBLE);
                    }
                },6000);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar3.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"Eureka",Toast.LENGTH_LONG).show();
                    }
                },9000);

            }
        });


    }
}