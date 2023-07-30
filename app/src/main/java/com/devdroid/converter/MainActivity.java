package com.devdroid.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ctf,ftc;
    EditText temp;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctf=findViewById(R.id.ctf);
        ftc=findViewById(R.id.ftc);
        result=findViewById(R.id.result);
        temp=findViewById(R.id.temp);
        ctf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entemp = Double.parseDouble(temp.getText().toString());
                double conresult = (entemp*1.8)+ 32;
                result.setText(String.valueOf(conresult));
            }
        });
        ftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double entemp = Double.parseDouble(temp.getText().toString());
                double conresult =(entemp-32)/1.8;
                result.setText(String.valueOf(conresult));
            }
        });
    }
}