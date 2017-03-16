package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        t1 =(TextView)findViewById(R.id.t1);
        t2 =(TextView)findViewById(R.id.t2);
        t3 =(TextView)findViewById(R.id.t3);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);


    }
}
