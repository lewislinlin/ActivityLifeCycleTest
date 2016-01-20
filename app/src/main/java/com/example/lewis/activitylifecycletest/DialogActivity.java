package com.example.lewis.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by lewis on 2016/1/12.
 */
public class DialogActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstatanceState){
        super.onCreate(savedInstatanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);
    }
}
