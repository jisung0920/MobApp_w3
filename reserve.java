package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class reserve extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);
        init();
    }
    void init(){
        t1 =(TextView)findViewById(R.id.t1);
        t2 =(TextView)findViewById(R.id.t2);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);

    }
}
