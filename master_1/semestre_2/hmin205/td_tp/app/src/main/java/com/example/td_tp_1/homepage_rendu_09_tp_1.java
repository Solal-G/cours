package com.example.td_tp_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class homepage_rendu_09_tp_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        //Titre
        TextView titre = new TextView(this);
        titre.setText("HOMEPAGE TP1 rendu 09/02");
        titre.setTextSize(20);
        titre.setPadding(20,20,20,20);
        titre.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        titre.setGravity(View.TEXT_ALIGNMENT_CENTER);

        main_layout.addView(titre);

        //Layout liste bouton
        LinearLayout listeBoutons = new LinearLayout(this);
        listeBoutons.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        listeBoutons.setOrientation(LinearLayout.VERTICAL);

        Button btnExercice1 = new Button(this);
        btnExercice1.setText("Exercice 5, 6, 7");
        btnExercice1.setTextSize(15);
        btnExercice1.setAllCaps(false);
        btnExercice1.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice1);
        btnExercice1.setOnClickListener(v -> {startActivity(new Intent(this,tp1_exercice_5.class));});

        Button btnExercice4 = new Button(this);
        btnExercice4.setText("Exercice 8");
        btnExercice4.setTextSize(15);
        btnExercice4.setAllCaps(false);
        btnExercice4.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice4);
        btnExercice4.setOnClickListener(v -> {startActivity(new Intent(this,tp1_exercice8.class));});

        main_layout.addView(listeBoutons);
    }
}