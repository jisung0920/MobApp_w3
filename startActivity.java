package com.example.jisung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onclick(View v){
        Intent intent;
        if(v.getId()==R.id.b1)
            intent = new Intent(startActivity.this,RelativeActivity.class);
        else if(v.getId()==R.id.b2)
            intent = new Intent(startActivity.this,MainActivity.class);
        else
            intent = new Intent(startActivity.this,ReserveRActivity.class);

        Log.d("intent","success");
        startActivity(intent);
    }
}
