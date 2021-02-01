package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Locale;

public class tp1_3_4_xml extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp1_3_4_xml);
        Button switch1 =  findViewById(R.id.switch1);
        switch1.setOnClickListener(v -> {

            if(Locale.getDefault().getLanguage() == "fr"){
                setLangage("en");
            }
            else{
                setLangage("fr");
            }
        });
    }


    void setLangage(String lang){
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        Locale.setDefault(myLocale);
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, tp1_3_4_xml.class);
        finish();
        startActivity(refresh);
    }

    
}