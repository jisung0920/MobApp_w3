package com.example.jisung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;

    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    public void ButtonClick(View v){
        Log.d("button","click");
        Log.d("ID",v.getId()+"");
        if(v.getId()==R.id.b1){

            int a,b,c;

            if(e1.getText().equals("")) {
                e1.setText("0");
            }
            else if(e2.getText().equals("")) {
                e2.setText("0");
            }
            else if(e3.getText().equals("")) {
                e3.setText("0");
            }
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = Integer.parseInt(e3.getText().toString());
            int result = a + b + c;
            int aver = result/3;
            t1.setText(result+"점");
            t2.setText(aver+"점");
            i1.setVisibility(View.VISIBLE);
            if(aver>=90)
                i1.setImageResource(R.drawable.a);
            else if(aver>=80)
                i1.setImageResource(R.drawable.b);
            else if(aver>=70)
                i1.setImageResource(R.drawable.c);
            else if(aver>=60)
                i1.setImageResource(R.drawable.d);
            else
                i1.setImageResource(R.drawable.f);


        }
        else{

            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
    void init(){
        t1 =(TextView)findViewById(R.id.t1);
        t2 =(TextView)findViewById(R.id.t2);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);
        i1 = (ImageView)findViewById(R.id.i1);


    }
}
