package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class homepage_tp3 extends AppCompatActivity {
    public EditText nom;
    public EditText prenom;
    public EditText age;
    public EditText telephone;
    public EditText mot_de_passe;

    public String id;

    public Utilisation util;

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("nom",nom.getText().toString());
        savedInstanceState.putString("prenom",prenom.getText().toString());
        savedInstanceState.putString("age",age.getText().toString());
        savedInstanceState.putString("telephone",telephone.getText().toString());
        savedInstanceState.putString("id",id);
        savedInstanceState.putInt("nombre_utilisation",util.getCompteur());
        mot_de_passe.setText(null);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null){
            nom.setText(savedInstanceState.getString("nom"));
            prenom.setText(savedInstanceState.getString("prenom"));
            age.setText(savedInstanceState.getString("age"));
            telephone.setText(savedInstanceState.getString("telephone"));
            id = savedInstanceState.getString("id");
            //util = new Utilisation(this);
            //util.setCompteur(savedInstanceState.getInt("nombre_utilisation"));
            //util.incremente();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_homepage_tp3);

            nom = (EditText) findViewById(R.id.champ_nom);
            String nom_value = nom.getText().toString();

            prenom = (EditText) findViewById(R.id.champ_prenom);
            String prenom_value = prenom.getText().toString();

            age = (EditText) findViewById(R.id.champ_age);
            String age_value = age.getText().toString();

            telephone = (EditText) findViewById(R.id.champ_telephone);
            String telephone_value = telephone.getText().toString();

            mot_de_passe = (EditText) findViewById(R.id.champ_mot_de_passe);
            String mot_de_passe_value = mot_de_passe.getText().toString();

            if(savedInstanceState == null){
                Random r = new Random();
                id = r.nextInt(10000)+"";
            }

            findViewById(R.id.button_send).setOnClickListener(v -> onSubmit(this));

            util = new Utilisation(this);
            getLifecycle().addObserver(util);

        findViewById(R.id.button_planning).setOnClickListener(v -> affichePlanning(this));
    }

    public void onSubmit(homepage_tp3 v){
        String nom_fichier = nom.getText().toString()+"-"+id;

        try {
            FileOutputStream fichier = openFileOutput(nom_fichier, Context.MODE_PRIVATE);
            fichier.write((this.nom.getText().toString()+"\n").getBytes());
            fichier.write((this.prenom.getText().toString()+"\n").getBytes());
            fichier.write((this.age.getText().toString()+"\n").getBytes());
            fichier.write((this.telephone.getText().toString()+"\n").getBytes());
            fichier.write((this.mot_de_passe.getText().toString()+"\n").getBytes());
            fichier.close();

            Toast.makeText(getApplicationContext(),"Fichier enregistré", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Erreur fichier", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        Intent newActivity = new Intent(this, tp3_lecture_fichier.class);
        newActivity.putExtra("nom_du_fichier", nom_fichier);
        newActivity.putExtra("util",util.getCompteur());
        this.startActivity(newActivity);
    }

    public void affichePlanning(homepage_tp3 v){
        Intent newActivity = new Intent(this, planning.class);
        this.startActivity(newActivity);
    }
}