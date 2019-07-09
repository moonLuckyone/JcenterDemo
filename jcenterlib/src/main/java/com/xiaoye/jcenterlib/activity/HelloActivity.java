package com.xiaoye.jcenterlib.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xiaoye.jcenterlib.R;

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloActivity.this,"娃哈哈娃哈哈娃哈哈...",Toast.LENGTH_LONG).show();
            }
        });
    }
}
