package com.zhbit.luo.logactivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("LogActivity1","LogActivity1-------------->onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logactivity);

        Button  btn = (Button)findViewById(R.id.btn_start);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LogActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.v("LogActivity1","LogActivity1-------------->onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.v("LogActivity1","LogActivity1-------------->onReStart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.v("LogActivity1","LogActivity1-------------->onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("LogActivity1","LogActivity1-------------->onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v("LogActivity1","LogActivity1-------------->onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v("LogActivity1", "LogActivity1-------------->onResume");
        super.onResume();
    }
}
