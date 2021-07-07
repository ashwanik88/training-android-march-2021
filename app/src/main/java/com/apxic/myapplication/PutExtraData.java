package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PutExtraData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_extra_data);

        Intent newint = getIntent();
        String username = newint.getStringExtra("USERNAME");

        Toast.makeText(this, "Username = " + username, Toast.LENGTH_SHORT).show();

    }
}