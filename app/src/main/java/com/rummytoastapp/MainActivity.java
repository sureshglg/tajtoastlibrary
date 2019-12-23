package com.rummytoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rummytoast.LibraryActivity;
import com.rummytoast.RummyToastLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RummyToastLib.displayToast(this,"Rummy Toast");

    }

    public void onButtonClick(View view) {
        Intent in = new Intent(getApplicationContext(), LibraryActivity.class);
        startActivity(in);
    }
}
