package com.example.student.ducatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1 =findViewById(R.id.textView);
        Bundle b= getIntent().getExtras();

      String s = b.getString("abc");
      tv1.setText("Welcome : "+s);
    }
}
