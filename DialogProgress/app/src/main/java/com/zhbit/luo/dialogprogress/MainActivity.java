package com.zhbit.luo.dialogprogress;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
    private int  i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialogprogress);
        final ProgressBar progressBar1 = (ProgressBar)findViewById(R.id.progress_1);
        final ProgressBar progressBar2 = (ProgressBar)findViewById(R.id.progress_2);
        Button btn  = (Button)findViewById(R.id.btn_begin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i == 0){
                    progressBar1.setVisibility(View.VISIBLE);
                    progressBar2.setVisibility(View.VISIBLE);
                    progressBar1.setMax(100);
                }else if(i<=progressBar1.getMax()){
                    progressBar1.setProgress(i);
                    progressBar1.setSecondaryProgress(i+10);
                }else{
                    progressBar1.setVisibility(View.GONE);
                    progressBar2.setVisibility(View.GONE);
                    i = 0;
                }
                i = i + 10;
            }
        });
    }
}
