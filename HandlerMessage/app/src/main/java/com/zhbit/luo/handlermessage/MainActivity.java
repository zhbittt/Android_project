package com.zhbit.luo.handlermessage;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


import java.util.logging.LogRecord;

public class MainActivity extends Activity {
    ProgressBar  progressbar;
    Button       btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        progressbar = (ProgressBar)findViewById(R.id.progressbar);
        btn_start   = (Button)findViewById(R.id.start);
        btn_start.setOnClickListener(new ButtonListener());
    }

    class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            progressbar.setVisibility(View.VISIBLE);
            updateBarHandler.post(updateThread);
        }
    }
    Handler  updateBarHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            progressbar.setProgress(msg.arg1);
            updateBarHandler.post(updateThread);
        }
    };
    Runnable updateThread = new Runnable() {
        int i= 0;
        @Override
        public void run() {
            System.out.println("Begin Thread");
            i = i+10;
            Message  msg = updateBarHandler.obtainMessage();
            msg.arg1 = i;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            updateBarHandler.sendMessage(msg);
            if(i == 100){
                updateBarHandler.removeCallbacks(updateThread);
            }
        }
    };
}
