package com.example.siddhi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Thread ma_thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ma_thread=new Thread();

        //Initialize the thread object
        ma_thread=new Thread(){
            public void run(){
                try {
                    //  Toast.makeText(MainActivity.this, "Sleeping", Toast.LENGTH_SHORT).show();
                    sleep(10000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                }
                finally
                {
                    // Toast.makeText(MainActivity.this, "Inside finally", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,BuyArea.class);
                    startActivity(intent);
                }
            }
        };
        ma_thread.start();
    }
}
