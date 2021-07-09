package com.apxic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class myFragmentActivity extends AppCompatActivity {
    public myFragmentActivity(){
        super(R.layout.activity_my_fragment);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, BlankFragment.class, null)
                    .commit();
        }
    }
}