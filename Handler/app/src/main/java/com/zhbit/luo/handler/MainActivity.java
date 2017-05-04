package com.zhbit.luo.handler;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {

    private Button  btn_start = null;
    private Button  btn_end   = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn_start  = (Button)findViewById(R.id.start);
        btn_end  = (Button)findViewById(R.id.end);
        btn_start.setOnClickListener(new btnStartLinstner());
        btn_end.setOnClickListener(new btnEndLinstner());
    }

     Handler handler  = new Handler();
     class btnStartLinstner implements View.OnClickListener {
         @Override
         public void onClick(View v) {
           handler.post(updateThread);
         }
     }

    class btnEndLinstner implements View.OnClickListener {
        @Override
        public void onClick(View v) {
             handler.removeCallbacks(updateThread);
        }
    }
    Runnable  updateThread = new Runnable() {
        @Override
        public void run() {
            System.out.println("UpdateThread");
            Log.v("tag","UpdateThread");
            handler.postDelayed(updateThread,2000);
        }
    };
}
