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

public class homepage_td_1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_td_1);


        LinearLayout mainLayout = findViewById(R.id.main_layout);

        //Titre
        TextView titre = new TextView(this);
        titre.setText("HOMEPAGE TD1");
        titre.setTextSize(20);
        titre.setPadding(20,20,20,20);
        titre.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        titre.setGravity(View.TEXT_ALIGNMENT_CENTER);

        mainLayout.addView(titre);

        //Layout liste bouton
        LinearLayout listeBoutons = new LinearLayout(this);
        listeBoutons.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        listeBoutons.setOrientation(LinearLayout.VERTICAL);

        //Bouton 1
        Button btnExercice1 = new Button(this);
        btnExercice1.setText("Exercice 1");
        btnExercice1.setTextSize(15);
        btnExercice1.setAllCaps(false);
        btnExercice1.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice1);
        btnExercice1.setOnClickListener(v -> {startActivity(new Intent(this,td1_exercice1.class));});

        //Bouton 2
        Button btnExercice2 = new Button(this);
        btnExercice2.setText("Exercice 2");
        btnExercice2.setTextSize(15);
        btnExercice2.setAllCaps(false);
        btnExercice2.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice2);
        btnExercice2.setOnClickListener(v -> {startActivity(new Intent(this,td1_exercice2.class));});

        //Bouton 3
        Button btnExercice3 = new Button(this);
        btnExercice3.setText("Exercice 3");
        btnExercice3.setTextSize(15);
        btnExercice3.setAllCaps(false);
        btnExercice3.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice3);
        btnExercice3.setOnClickListener(v -> {startActivity(new Intent(this,td1_exercice3.class));});

        //Bouton 4
        Button btnExercice4 = new Button(this);
        btnExercice4.setText("Exercice 4");
        btnExercice4.setTextSize(15);
        btnExercice4.setAllCaps(false);
        btnExercice4.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice4);
        btnExercice4.setOnClickListener(v -> {startActivity(new Intent(this,td1_exercice4.class));});

        //Bouton 5
        Button btnExercice5 = new Button(this);
        btnExercice5.setText("Exercice 5");
        btnExercice5.setTextSize(15);
        btnExercice5.setAllCaps(false);
        btnExercice5.setPadding(20,20,20,20);
        listeBoutons.addView(btnExercice5);
        btnExercice5.setOnClickListener(v -> {startActivity(new Intent(this,td1_exercice5.class));});


        mainLayout.addView(listeBoutons);
    }
}