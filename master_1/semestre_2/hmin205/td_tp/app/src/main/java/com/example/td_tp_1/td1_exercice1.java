package com.example.td_tp_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class td1_exercice1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        //Titre
        TextView titre = new TextView(this);
        titre.setText("Exercice 1");
        titre.setTextSize(20);
        titre.setPadding(20,20,20,20);
        titre.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        titre.setGravity(View.TEXT_ALIGNMENT_CENTER);
        main_layout.addView(titre);

        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        main_layout.addView(tv);

        //Zone de saisie
        EditText saisie = new EditText(this);
        saisie.setHint("Ceci est une zone de texte");
        main_layout.addView(saisie);


    }
}