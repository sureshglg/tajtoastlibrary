package com.rummytoast;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class LibraryActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
}
