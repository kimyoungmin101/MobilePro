package com.cookandroid.project_testactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    EditText ed, ed2;
    Button log, reg;
    String id;
    int k;
    Intent intent;
    String [] en = new String[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초기 화면");
        int i = -1;
        intent = getIntent();


        ed = (EditText) findViewById(R.id.edi);
        ed2 = (EditText) findViewById(R.id.edi2);
        log = (Button) findViewById(R.id.btnlog);
        reg = (Button) findViewById(R.id.btnreg);
        id = ed.getText().toString();



        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }

        });
        reg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent2);
            }
        });

    }
}
