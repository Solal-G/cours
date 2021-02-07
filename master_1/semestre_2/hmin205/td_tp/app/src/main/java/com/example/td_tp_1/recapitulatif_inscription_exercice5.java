package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class recapitulatif_inscription_exercice5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        TextView title = new TextView(this);
        title.setText("Récapitulatif inscription");
        title.setTextSize(20);
        main_layout.addView(title);

        Intent intent = getIntent();
        if(intent != null){
            String prenom = "";
            if(intent.hasExtra("prenom")){
                prenom = intent.getStringExtra("prenom");
            }
            TextView affiche_prenom = new TextView(this);
            affiche_prenom.setText("Prenom : " + prenom);
            main_layout.addView(affiche_prenom);

            String nom = "";
            if(intent.hasExtra("nom")){
                nom = intent.getStringExtra("nom");
            }
            TextView affiche_nom = new TextView(this);
            affiche_nom.setText("Nom : " + nom);
            main_layout.addView(affiche_nom);

            String ddn = "";
            if(intent.hasExtra("ddn")){
                ddn = intent.getStringExtra("ddn");
            }
            TextView affiche_ddn = new TextView(this);
            affiche_ddn.setText("Date de naissance : " + ddn);
            main_layout.addView(affiche_ddn);

            String ddc = "";
            if(intent.hasExtra("ddc")){
                ddc = intent.getStringExtra("ddc");
            }
            TextView affiche_ddc = new TextView(this);
            affiche_ddc.setText("Domaine de compétence : " + ddc);
            main_layout.addView(affiche_ddc);

            String telephone = "";
            if(intent.hasExtra("telephone")){
                telephone = intent.getStringExtra("telephone");
            }
            TextView affiche_telephone = new TextView(this);
            affiche_telephone.setText("Telephone : " + telephone);
            main_layout.addView(affiche_telephone);

            Button appeler = new Button(this);
            appeler.setText("Appeler");
            appeler.setTextSize(15);
            appeler.setAllCaps(false);
            appeler.setPadding(20,20,20,20);
            main_layout.addView(appeler);
            String t = telephone;
            Intent phone = new Intent(Intent.ACTION_DIAL);
            phone.setData(Uri.parse("tel:" + t));
            appeler.setOnClickListener(v -> {startActivity(phone);});

        }

        Button ok = new Button(this);
        ok.setText("OK");
        ok.setTextSize(15);
        ok.setAllCaps(false);
        ok.setPadding(20,20,20,20);
        main_layout.addView(ok);
        ok.setOnClickListener(v -> {startActivity(new Intent(this, MainActivity.class));});

        Button retour = new Button(this);
        retour.setText("Retour");
        retour.setTextSize(15);
        retour.setAllCaps(false);
        retour.setPadding(20,20,20,20);
        main_layout.addView(retour);
        retour.setOnClickListener(v -> {startActivity(new Intent(this, tp1_exercice_5.class));});
    }
}