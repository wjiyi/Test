package com.example.administrator.test;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public class TitleLayout extends LinearLayout {

    Button button_back,Button_exit;

    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);

        button_back = (Button) findViewById(R.id.back);
        Button_exit = (Button) findViewById(R.id.button_edit);
        button_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        Button_exit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked EDIT button.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
