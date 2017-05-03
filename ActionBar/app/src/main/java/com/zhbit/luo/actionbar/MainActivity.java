package com.zhbit.luo.actionbar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity);
        getOverflowMenu();

    }

    private void getOverflowMenu() {
        try {
            ViewConfiguration  config = ViewConfiguration.get(this);
            Field menuKeyField  = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField !=null){
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_message:
                 Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_uri = Uri.parse("http://www.baidu.com");
                intent.setData(content_uri);
                startActivity(intent);
                //Toast.makeText(MainActivity.this,"打开信息",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Tel_book:
                Intent intent1 = new Intent(Intent.ACTION_PICK,null);
                intent1.setType("image/*");
                startActivity(intent1);
              //  startActivityForResult(intent1,11111);
            //    Intent intent = new Intent(Intent.ACTION_CALL,Uri .parse("tel:10086"));
            //     startActivity(intent);
            //   Toast.makeText(MainActivity.this,"打开电话簿",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
