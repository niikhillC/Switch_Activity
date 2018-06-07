package com.example.student.ducatapp;

import android.content.Intent;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;



public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
Button btn1,btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     t1=findViewById(R.id.editText);
     t2=findViewById(R.id.editText2);
     btn1=findViewById(R.id.button);

     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

            String a= t1.getText().toString();
             String b= t2.getText().toString();
             if(a.equals("abc") && b.equals("xyz"))
             {
                 Toast.makeText(MainActivity.this, "LOGIN SCUCESS", Toast.LENGTH_SHORT).show();
                 Intent n =new Intent(MainActivity.this, Second.class);
                 startActivity(n);
             }
             else if(a.equals("") && b.equals("")) {
                 Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                 t1.setError("Empty Feild");
             }
             else
             Toast.makeText(MainActivity.this, "FAILED", Toast.LENGTH_SHORT).show();
         }
     });

    }
}
