package com.zhbit.luo.choice_question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int  CODE = 0x717;
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        Button btn_sure = (Button)findViewById(R.id.sure);
        Button btn_cancel = (Button)findViewById(R.id.cancel);

        btn_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
                for (int i = 0; i < radioGroup.getChildCount(); i++) {
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    if (radioButton.isChecked()) {
                        if (radioButton.getText().toString().equals("in"))
                            choice = "您选择的答案是：正确";
                        else choice = "您选择的答案是：错误";
                        break;
                    }
                }
     /*           radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                        for (int i = 0; i < radioGroup.getChildCount(); i++) {
                            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                            if (radioButton.isChecked()) {
                                if (radioButton.getText().toString().equals("in"))
                                    choice = "您选择的答案是：正确";
                                else choice = "您选择的答案是：错误";
                                break;
                            }
                        }

                    }
                });*/
                Intent intent = new Intent(MainActivity.this, Result.class);
                Bundle bundle = new Bundle();
                bundle.putString("choice", choice);
                intent.putExtras(bundle);
                startActivityForResult(intent,CODE);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"不能取消   请选择答案！",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
