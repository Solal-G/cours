package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;

public class tp3_lecture_fichier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        TextView affichage_info = new TextView(this);
        main_layout.addView(affichage_info);


        Intent intent = getIntent();
        String nom_fichier = intent.getStringExtra("nom_du_fichier");

        try {
            FileInputStream file = openFileInput(nom_fichier);

            int character;
            StringBuilder contenu = new StringBuilder();

            while ( (character = file.read()) != -1) {
                contenu.append((char) character);
            }

            affichage_info.setText(contenu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView affichage_compteur = new TextView(this);
        main_layout.addView(affichage_compteur);

        affichage_compteur.setText("Nombre de Resume : "+intent.getIntExtra("util",-1));
    }
}