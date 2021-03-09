package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);

        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txt1.getText().toString());
                int b = Integer.parseInt(txt2.getText().toString());
                int c = a + b;

                Toast.makeText(MainActivity.this, String.valueOf(c), Toast.LENGTH_SHORT).show();
            }
        });
    }
}