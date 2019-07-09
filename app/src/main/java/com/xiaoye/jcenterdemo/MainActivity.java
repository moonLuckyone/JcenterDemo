package com.xiaoye.jcenterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xiaoye.jcenterlib.common.JcenterTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JcenterTest.startPage(MainActivity.this);
            }
        });
    }
}
