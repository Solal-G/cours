package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class td1_exercice5 extends AppCompatActivity {
    private CheckBox linux, macos, windows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_td1_exercice5);
        addListenerOnChkWindows();
        addListenerOnButton();
    }

    public void addListenerOnChkWindows() {
        windows = (CheckBox) findViewById(R.id.windows_option);
        windows.setOnClickListener(v -> {
            if (((CheckBox) v).isChecked()) {
                Toast.makeText(td1_exercice5.this,"Bro, try Linux :)", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addListenerOnButton() {
        linux = (CheckBox) findViewById(R.id.linux_option);
        macos = (CheckBox) findViewById(R.id.macos_option);
        windows = (CheckBox) findViewById(R.id.windows_option);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(v -> {
            StringBuffer result = new StringBuffer();
            result.append("Linux check : ").append(linux.isChecked());
            result.append("\nMac OS check : ").append(macos.isChecked());
            result.append("\nWindows check :").append(windows.isChecked());
            Toast.makeText(td1_exercice5.this, result.toString(), Toast.LENGTH_LONG).show();
        });
    }
}