package com.example.td_tp_1;

import androidx.lifecycle.ViewModel;

public class PlanningModel extends ViewModel {
    private String crenneau1 = "Rencontre client Dupont";
    private String crenneau2 = "Travailler dossier recrutement";
    private String crenneau3 = "Réunion équipe";
    private String crenneau4 = "Préparation dossier vente";

    public PlanningModel(){
    }

    public String get_crenneau1()
    {
        return this.crenneau1;
    }

    public String get_crenneau2() {
        return this.crenneau2;
    }

    public String get_crenneau3() {
        return this.crenneau3;
    }

    public String get_crenneau4() {
        return this.crenneau4;
    }
}
