package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.TvMsg2);
        txtMsg2.setText(R.string.Msg2);

        Log.i ("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "onstart called.....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "onresume called..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "onpause called..");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "onstop called..");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "ondestroy called..");

    }
}