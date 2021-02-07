package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

public class tp1_exercice_5 extends AppCompatActivity {

    public EditText nom;
    public EditText prenom;
    public EditText ddn;
    public EditText ddc;
    public EditText telephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        nom = new EditText(this);
        nom.setHint(getString(R.string.nom_tp1_4));
        main_layout.addView(nom);

        prenom = new EditText(this);
        prenom.setHint(getString(R.string.prenom_tp1_4));
        main_layout.addView(prenom);

        ddn = new EditText(this);
        ddn.setHint(getString(R.string.ddn_tp1_4));
        main_layout.addView(ddn);

        ddc = new EditText(this);
        ddc.setHint(getString(R.string.ddc_tp1_4));
        main_layout.addView(ddc);

        telephone = new EditText(this);
        telephone.setHint(getString(R.string.tel_tp1_4));
        main_layout.addView(telephone);

        Button send = new Button(this);
        send.setText(getString(R.string.send_tp1_4));
        send.setTextSize(15);
        send.setAllCaps(false);
        send.setPadding(20,20,20,20);
        main_layout.addView(send);
        send.setOnClickListener(v -> confirmation_envoie(this));
    }

    public void confirmation_envoie(tp1_exercice_5 v){
        AlertDialog.Builder confirmation = new AlertDialog.Builder(this);
        confirmation.setTitle("CONFIRMATION");
        confirmation.setMessage("Voulez vous continuer ?");
        confirmation.setPositiveButton("Oui", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Intent envoie = new Intent(v, recapitulatif_inscription_exercice5.class);
                        envoie.putExtra("prenom",prenom.getText().toString());
                        envoie.putExtra("nom",nom.getText().toString());
                        envoie.putExtra("ddn",ddn.getText().toString());
                        envoie.putExtra("ddc",ddc.getText().toString());
                        envoie.putExtra("telephone",telephone.getText().toString());
                        startActivity(envoie);
                    }
                });
        confirmation.setNegativeButton("Non", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                nom.getText().clear();
                prenom.getText().clear();
                ddn.getText().clear();
                ddc.getText().clear();
                telephone.getText().clear();
            }
        });
        confirmation.show();
    }
}