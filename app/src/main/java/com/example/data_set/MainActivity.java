package com.example.data_set;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.data_set.data.data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data data_test = new data();
        //ArrayList<data> data_test = new ArrayList<data>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Data data = new Data();
                data.dataList(data_test);
            }
        }).start();
    }
}