package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatabaseConnection extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_connection);

        DbHandler db = new DbHandler(this);

        // db.AddStudent("Rohan", "5");

        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);
        EditText txtID = findViewById(R.id.txtID);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtID.equals("")){
                    db.UpdateStudent(txtID.getText().toString(), txt1.getText().toString(), txt2.getText().toString());
                }else{
                    db.AddStudent(txt1.getText().toString(), txt2.getText().toString());
                }


            }
        });
    }
}