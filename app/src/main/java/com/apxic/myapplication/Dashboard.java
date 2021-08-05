package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Log.d("onCreate", "activity created");

        Button btnAddNumbers = findViewById(R.id.btnAddNumbers);
        Button btnCalc = findViewById(R.id.btnCalc);
        Button btnLayout = findViewById(R.id.btnLayout);
        Button btnContraint = findViewById(R.id.btnContraint);
        Button btnSticky = findViewById(R.id.btnSticky);
        Button btnPutextra = findViewById(R.id.btnPutextra);
        Button btnFragment = findViewById(R.id.btnFragment);
        Button btnBottomNav = findViewById(R.id.btnBottomNav);
        Button btnTabbed = findViewById(R.id.btnTabbed);
        Button btnLink = findViewById(R.id.btnLink);
        Button btnDatabase = findViewById(R.id.btnDatabase);

        btnAddNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, MainActivity.class);
                // i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                // finish(); //return to the first layout
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(Dashboard.this, Calculator.class);
                startActivity(abc);
            }
        });

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(Dashboard.this, RelativeLinear.class);
                startActivity(abc);
            }
        });

        btnContraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(Dashboard.this, ConstraintLayout.class);
                startActivity(abc);
            }
        });

        btnSticky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(Dashboard.this, StickyButtons.class);
                startActivity(abc);
            }
        });

        btnPutextra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, PutExtraData.class);
                i.putExtra("USERNAME", "admin");
                startActivity(i);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, myFragmentActivity.class);
                startActivity(i);
            }
        });

        btnBottomNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, BottomNavigation.class);
                startActivity(i);
            }
        });

        btnTabbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, TabbedActivity.class);
                startActivity(i);
            }
        });

        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apxic.com/"));
                startActivity(browserIntent);
            }
        });

        btnDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, DatabaseConnection.class);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

       // Log.d("onStart", "activity started");
    }
}