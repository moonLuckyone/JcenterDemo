package com.xiaoye.jcenterlib.common;

import android.content.Context;
import android.content.Intent;

import com.xiaoye.jcenterlib.activity.HelloActivity;


public class JcenterTest {
    public static void startPage(Context context){
        context.startActivity(new Intent(context, HelloActivity.class));
    }
}
