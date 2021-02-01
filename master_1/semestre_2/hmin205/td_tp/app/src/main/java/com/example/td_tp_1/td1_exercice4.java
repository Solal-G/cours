package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class td1_exercice4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        //Bouton 1
        Button btn1 = new Button(this);
        btn1.setText("My Toaster");
        btn1.setTextSize(15);
        btn1.setAllCaps(false);
        btn1.setPadding(20,20,20,20);
        main_layout.addView(btn1);
        btn1.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "My toaster", Toast.LENGTH_SHORT).show());

        //Texte à cacher
        TextView textAcacher = new TextView(this);
        textAcacher.setText("Exercice 4");
        textAcacher.setVisibility(View.INVISIBLE);
        main_layout.addView(textAcacher);

        //Bouton 2
        Button btn2 = new Button(this);
        btn2.setText("Afficher message");
        btn2.setTextSize(15);
        btn2.setAllCaps(false);
        btn2.setPadding(20,20,20,20);
        main_layout.addView(btn2);
        btn2.setOnClickListener(v -> textAcacher.setVisibility(View.VISIBLE));

        //Bouton 3
        Button btn3 = new Button(this);
        btn3.setText("Long toast");
        btn3.setTextSize(15);
        btn3.setAllCaps(false);
        btn3.setPadding(20,20,20,20);
        main_layout.addView(btn3);
        btn3.setOnLongClickListener(v -> {
            Toast.makeText(getApplicationContext(), "My long toaster", Toast.LENGTH_SHORT).show();
            return true;
        });

    }
}