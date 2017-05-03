package com.zhbit.luo.logdemo;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

        Button  btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("LogDemo","this is verbose");
                Log.d("LogDemo","this is debug");
                Log.i("LogDemo","this is information");
                Log.w("LogDemo","this is warning");
                Log.e("LogDemo","this is error");
            }
        });

    }
}
