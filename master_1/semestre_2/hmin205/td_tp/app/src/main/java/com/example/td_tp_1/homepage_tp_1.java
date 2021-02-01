package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class homepage_tp_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_tp_1);

        findViewById(R.id.btn_xml_tp1).setOnClickListener(v -> {startActivity(new Intent(this,tp1_3_4_xml.class));});
        findViewById(R.id.btn_java_tp1).setOnClickListener(v -> {startActivity(new Intent(this,tp1_3_4_java.class));});
    }
}