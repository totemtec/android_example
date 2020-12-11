package com.totemtec.actionsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSlideUpMenu(View view) {
        ActionSheet dialog = new ActionSheet(this);
        dialog.show();
    }
}