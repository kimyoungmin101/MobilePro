package com.cookandroid.project_testactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;
import java.util.ArrayList;



public class SecondActivity extends MainActivity {
    Button back;
    Button check;
    Button save;
    EditText etid;
    ArrayList <String> hw = new ArrayList <String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("회원 가입 구성");


        back = (Button) findViewById(R.id.buttonback);
        check = (Button) findViewById(R.id.buttoncheck);
        save = (Button) findViewById(R.id.buttonsave);
        etid = (EditText)findViewById(R.id.editText3);
        id = etid.getText().toString();



        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etid.getText().toString().length() == 0){
                    Toast.makeText(SecondActivity.this, "id를 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SecondActivity.this,"회원가입 성공",Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                    hw.add(etid.getText().toString());
                    intent2.putExtra("hw",hw);
                    startActivity(intent2);
                }

            }
        });
    }
}