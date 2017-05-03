package com.zhbit.luo.datepickerdialogexamp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends Activity {
    public  int year,month,day;
    public  TextView showdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        showdate = (TextView)findViewById(R.id.showdate);
        Button button = (Button)findViewById(R.id.btn_change);

        Calendar  calendar = Calendar.getInstance(Locale.CHINA);
        Date date = new Date();
        calendar.setTime(date);
        year  = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        day   = calendar.get(Calendar.DAY_OF_MONTH);

        showdate.setText("当前日期："+year+"年"+month+"月"+day+"日");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog  my_datepickerdialog  = new DatePickerDialog(MainActivity.this,Datelistener,year,month,day);
                my_datepickerdialog.show();
            }
        });
    }
    private  DatePickerDialog.OnDateSetListener Datelistener = new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int y, int m, int d) {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String  date1 = year+"-"+month+"-"+day;
            String  date2 = y +"-"+m+"-"+d;
            Log.i("tag",date1);
            Log.i("tag",date2);
            try {
                Date nowTime = simpleDateFormat.parse(date1);
                Date selectTime   = simpleDateFormat.parse(date2);

                if(((nowTime.getTime()-selectTime.getTime())/(24*60*60*1000))>0){
                    showdate.setText("当前日期："+y+"年"+m+"月"+d+"日");
                }else{
                    showdate.setText("选择日期错误！");
                }

            }catch ( ParseException e){
                e.printStackTrace();
            }


        }
    };
}
