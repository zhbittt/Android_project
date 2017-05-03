package com.zhbit.luo.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Luo on 2017/4/6.
 */
public class OptionMenu  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionmenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,1,1,R.string.save);
        menu.add(Menu.NONE,2,2,R.string.exit);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==1){
            Toast.makeText(OptionMenu.this,R.string.save,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(OptionMenu.this,R.string.exit,Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
