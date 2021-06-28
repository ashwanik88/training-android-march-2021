package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Calculator extends AppCompatActivity {
    int a, b;
    String opr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        EditText txtOutput = findViewById(R.id.txtOutput);

        Button btn7 =findViewById(R.id.btn7);
        Button btn8 =findViewById(R.id.btn8);
        Button btn9 =findViewById(R.id.btn9);
        Button btnPlus =findViewById(R.id.btnPlus);
        Button btnEqual =findViewById(R.id.btnEqual);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txtOutput.getText().toString() + btn7.getText().toString();
                txtOutput.setText(str);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txtOutput.getText().toString() + btn8.getText().toString();
                txtOutput.setText(str);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txtOutput.getText().toString() + btn9.getText().toString();
                txtOutput.setText(str);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txtOutput.getText().toString());
                opr = btnPlus.getText().toString();
                txtOutput.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Integer.parseInt(txtOutput.getText().toString());
                int c = 0;


                Log.d("result", opr);

                if(opr.equals("+")){
                    c = a + b;
                    a = c;
                }

                txtOutput.setText(String.valueOf(c));

            }
        });


    }
}