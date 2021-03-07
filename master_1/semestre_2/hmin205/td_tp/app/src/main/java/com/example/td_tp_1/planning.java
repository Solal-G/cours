package com.example.td_tp_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class planning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);

        PlanningModel planningModel = new PlanningModel();

        TextView slot1 = findViewById(R.id.box1);
        slot1.setText(planningModel.get_crenneau1());

        TextView slot2 = findViewById(R.id.box2);
        slot2.setText(planningModel.get_crenneau2());

        TextView slot3 = findViewById(R.id.box3);
        slot3.setText(planningModel.get_crenneau3());

        TextView slot4 = findViewById(R.id.box4);
        slot4.setText(planningModel.get_crenneau4());
    }
}