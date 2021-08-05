package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DatabaseConnection extends AppCompatActivity {

    final DbHandler db = new DbHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_connection);

        db.AddStudent("Rohan", "5");
    }
}