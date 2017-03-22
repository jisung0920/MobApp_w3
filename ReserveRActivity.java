package com.example.jisung.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class ReserveRActivity extends AppCompatActivity {

    TextView t0,t1,t2,t3,t4,t5;
    Button b1,b2;
    EditText e1,e2,e3;
    DatePicker d1_lay;
    TimePicker t1_lay;
    GridLayout g1_lay,g2_lay;
    Switch s1;
    Chronometer c1;
    String date;
    String time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_r);
        setTitle("레스토랑 예약");
        init();
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    d1_lay.setVisibility(View.VISIBLE);
                    c1.start();
                    c1.setVisibility(View.VISIBLE);
                    t0.setVisibility(View.VISIBLE);
                    b1.setEnabled(false);
                    b2.setEnabled(true);
                }
                else{
                    d1_lay.setVisibility(View.INVISIBLE);
                    g1_lay.setVisibility(View.INVISIBLE);
                    g2_lay.setVisibility(View.INVISIBLE);
                    c1.stop();
                    c1.setBase(SystemClock.elapsedRealtime());
                    c1.setVisibility(View.INVISIBLE);
                    t0.setVisibility(View.INVISIBLE);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                }
            }
        });
    }

    public void buttonClick(View v){
        Log.d("id check",v.getId()+"view ID\n"+R.id.b1+"b1 id\n"+R.id.b2+"b2 id");
        if(v.getId()==R.id.b2){

            if(d1_lay.getVisibility()==View.VISIBLE){
                b1.setEnabled(true);
                d1_lay.setVisibility(View.INVISIBLE);
                t1_lay.setVisibility(View.VISIBLE);
                date = String.format("%d년 %d월 %d일",d1_lay.getYear(),d1_lay.getMonth(),d1_lay.getDayOfMonth());
            }
            else if(t1_lay.getVisibility()==View.VISIBLE){
                t1_lay.setVisibility(View.INVISIBLE);
                g1_lay.setVisibility(View.VISIBLE);
                time = String.format("%d시 %d분",t1_lay.getHour(),t1_lay.getMinute());
            }
            else if(g1_lay.getVisibility()==View.VISIBLE){
                g1_lay.setVisibility(View.INVISIBLE);
                g2_lay.setVisibility(View.VISIBLE);
                t1.setText(date);
                t2.setText(time);
                t3.setText(e1.getText().toString()+"명");
                t4.setText(e2.getText().toString()+"명");
                t5.setText(e3.getText().toString()+"명");
                b2.setEnabled(false);
            }
            else//click event
                v.setEnabled(false);

        }
        else{
            if(t1_lay.getVisibility()==View.VISIBLE){
                t1_lay.setVisibility(View.INVISIBLE);
                d1_lay.setVisibility(View.VISIBLE);

            }
            if(g1_lay.getVisibility()==View.VISIBLE){
                g1_lay.setVisibility(View.INVISIBLE);
                t1_lay.setVisibility(View.VISIBLE);
            }
            else if(g2_lay.getVisibility()==View.VISIBLE){
                g2_lay.setVisibility(View.INVISIBLE);
                g1_lay.setVisibility(View.VISIBLE);
                b2.setEnabled(true);
            }
            else
                v.setEnabled(false);
        }
    }


    void init(){
        t0 =(TextView)findViewById(R.id.t0);
        t1 =(TextView)findViewById(R.id.t1);
        t2 =(TextView)findViewById(R.id.t2);
        t3 =(TextView)findViewById(R.id.t3);
        t4 =(TextView)findViewById(R.id.t4);
        t5 =(TextView)findViewById(R.id.t5);
        b1 =(Button)findViewById(R.id.b1);
        b2 =(Button)findViewById(R.id.b2);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);
        d1_lay =(DatePicker)findViewById(R.id.d1);
        t1_lay =(TimePicker)findViewById(R.id.tp1);
        g1_lay =(GridLayout)findViewById(R.id.g1);
        g2_lay =(GridLayout)findViewById(R.id.g2);
        s1 = (Switch)findViewById(R.id.s1);
        c1 = (Chronometer)findViewById(R.id.c1);

    }
}
