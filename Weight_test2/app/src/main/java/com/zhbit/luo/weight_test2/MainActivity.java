package com.zhbit.luo.weight_test2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
    String sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button  btn = (Button)findViewById(R.id.btn_calculate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup  rg = (RadioGroup)findViewById(R.id.group);
                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId == R.id.man) {
                            sex = "M";
                        } else {
                            sex = "F";
                        }
                        System.out.println(sex + "000000000000000000");
                    }
                });
                EditText  et = (EditText)findViewById(R.id.high);
                Double height = Double.parseDouble(et.getText().toString());
                Intent intent = new Intent(MainActivity.this,Result.class);
                Bundle bundle = new Bundle();
                bundle.putString("sex",sex);
                bundle.putDouble("height", height);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
