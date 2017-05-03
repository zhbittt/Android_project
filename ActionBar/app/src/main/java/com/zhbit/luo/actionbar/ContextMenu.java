package com.zhbit.luo.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Luo on 2017/4/6.
 */
public class ContextMenu extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextmenu);
        TextView tv = (TextView)findViewById(R.id.ContextMenu);
        registerForContextMenu(tv);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,1,1,R.string.New);
        menu.add(Menu.NONE,2,2,R.string.Open);
        return super.onCreateOptionsMenu(menu);
    }*/

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,1,R.string.New);
        menu.add(0,2,2,R.string.Open);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==1){
            Toast.makeText(ContextMenu.this, R.string.New, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(ContextMenu.this,R.string.Open,Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
