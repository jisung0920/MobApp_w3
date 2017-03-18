package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ReserveRActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;
    DatePicker d1_lay;
    GridLayout g1_lay,g2_lay;
    Switch s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_r);
        init();
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    d1_lay.setVisibility(View.VISIBLE);
                else{
                    d1_lay.setVisibility(View.INVISIBLE);
                    g1_lay.setVisibility(View.INVISIBLE);
                    g2_lay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    public void buttonClick(View v){
        Log.d("id check",v.getId()+"view ID\n"+R.id.b1+"b1 id\n"+R.id.b2+"b2 id");
        if(v.getId()==R.id.b2){
            if(d1_lay.getVisibility()==View.VISIBLE){
                d1_lay.setVisibility(View.INVISIBLE);
                g1_lay.setVisibility(View.VISIBLE);
            }
            else if(g1_lay.getVisibility()==View.VISIBLE){
                g1_lay.setVisibility(View.INVISIBLE);
                g2_lay.setVisibility(View.VISIBLE);
            }
            else
                Toast.makeText(getApplicationContext(),"마지막 화면입니다.", Toast.LENGTH_SHORT).show();
        }
        else{
            if(g1_lay.getVisibility()==View.VISIBLE){
                g1_lay.setVisibility(View.INVISIBLE);
                d1_lay.setVisibility(View.VISIBLE);
            }
            else if(g2_lay.getVisibility()==View.VISIBLE){
                g2_lay.setVisibility(View.INVISIBLE);
                g1_lay.setVisibility(View.VISIBLE);
            }
            else
                Toast.makeText(getApplicationContext(),"처음 화면입니다.",Toast.LENGTH_SHORT).show();
        }
    }
    void init(){
        t1 =(TextView)findViewById(R.id.t1);
        t2 =(TextView)findViewById(R.id.t2);
        t3 =(TextView)findViewById(R.id.t3);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);
        d1_lay =(DatePicker)findViewById(R.id.d1);
        g1_lay =(GridLayout)findViewById(R.id.g1);
        g2_lay =(GridLayout)findViewById(R.id.g2);
        s1 = (Switch)findViewById(R.id.s1);

    }
}
