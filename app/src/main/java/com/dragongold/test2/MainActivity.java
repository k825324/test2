package com.dragongold.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = "for test222222";
        int t = 77777;
    }
    void testMaster() {
        Log.d("test","測試 master 功能");
    }
}
