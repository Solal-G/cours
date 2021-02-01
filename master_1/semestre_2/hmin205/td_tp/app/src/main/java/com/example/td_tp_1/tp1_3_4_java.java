package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;

public class tp1_3_4_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main_layout = new LinearLayout(this);
        main_layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        main_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(main_layout);

        Button switch1 = new Button(this);
        switch1.setText(getString(R.string.switch_langage));
        switch1.setTextSize(15);
        switch1.setAllCaps(false);
        switch1.setPadding(20,20,20,20);
        main_layout.addView(switch1);
        switch1.setOnClickListener(v -> {

            if(Locale.getDefault().getLanguage() == "fr"){
                setLangage("en");
            }
            else{
                setLangage("fr");
            }
        });

        EditText nom = new EditText(this);
        nom.setHint(getString(R.string.nom_tp1_4));
        main_layout.addView(nom);

        EditText prenom = new EditText(this);
        prenom.setHint(getString(R.string.prenom_tp1_4));
        main_layout.addView(prenom);

        EditText ddn = new EditText(this);
        ddn.setHint(getString(R.string.ddn_tp1_4));
        main_layout.addView(ddn);

        EditText ddc = new EditText(this);
        ddc.setHint(getString(R.string.ddc_tp1_4));
        main_layout.addView(ddc);

        EditText telephone = new EditText(this);
        telephone.setHint(getString(R.string.tel_tp1_4));
        main_layout.addView(telephone);

        Button send = new Button(this);
        send.setText(getString(R.string.send_tp1_4));
        send.setTextSize(15);
        send.setAllCaps(false);
        send.setPadding(20,20,20,20);
        main_layout.addView(send);
        send.setOnClickListener(v -> Toast.makeText(getApplicationContext(), getString(R.string.envoie), Toast.LENGTH_SHORT).show());

    }

    void setLangage(String lang){
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        Locale.setDefault(myLocale);
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, tp1_3_4_java.class);
        finish();
        startActivity(refresh);
    }
}