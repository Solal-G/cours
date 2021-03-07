package com.example.td_tp_1;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class Utilisation implements LifecycleObserver {
    private Context context;
    private int compteur = 0;

    public Utilisation(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void incremente () {
        System.out.println("BAM");
        this.compteur++;
    }

    public int getCompteur() {
        return this.compteur;
    }

    public void setCompteur(int a) {
        compteur = a;
    }

    public void resetCompteur(){
        compteur = 0;
    }

    @Override
    public String toString() {
        return "Nombre d'utilisataion : " + this.getCompteur();
    }
}
