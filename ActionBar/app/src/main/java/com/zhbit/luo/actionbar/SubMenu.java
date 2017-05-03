package com.zhbit.luo.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Luo on 2017/4/6.
 */
public class SubMenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        android.view.SubMenu sub = menu.addSubMenu(R.string.Find);
        sub.add(Menu.NONE,1,1,R.string.BenDi);
        sub.add(Menu.NONE,2,2,R.string.Internet);
        return super.onCreateOptionsMenu(menu);
    }
}
