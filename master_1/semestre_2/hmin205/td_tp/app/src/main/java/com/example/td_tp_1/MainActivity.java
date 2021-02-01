package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Switch;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rendu_btn_td_1).setOnClickListener(v -> {startActivity(new Intent(this,homepage_td_1.class));});
        findViewById(R.id.rendu_btn_tp_1).setOnClickListener(v -> {startActivity(new Intent(this,homepage_tp_1.class));});
    }

}