package com.zhbit.luo.logactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Luo on 2017/3/30.
 */
public class LogActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("LogActivity2", "LogActivity2-------------->onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logactivity2);
    }
    @Override
    protected void onStart() {
        Log.v("LogActivity2", "LogActivity2-------------->onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.v("LogActivity2", "LogActivity2-------------->onReStart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.v("LogActivity2", "LogActivity2-------------->onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("LogActivity2", "LogActivity2-------------->onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v("LogActivity2", "LogActivity2-------------->onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.v("LogActivity2", "LogActivity2-------------->onResume");
        super.onResume();
    }
}
