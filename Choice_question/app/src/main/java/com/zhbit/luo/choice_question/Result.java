package com.zhbit.luo.choice_question;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.ResultSet;

/**
 * Created by Luo on 2017/3/16.
 */
public class Result  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);


        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String choice = bundle.getString("choice");
        TextView textView = (TextView)findViewById(R.id.show);
        textView.setText(choice);
        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Result.this.setResult(RESULT_OK,intent);
                //Result.this.finish();
                setResult(0x717,intent);
                finish();
            }
        });
    }
}
