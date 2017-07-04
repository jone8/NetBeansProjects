/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kari
 */
public class Muutoshistoria {

    private List<Double> muutokset;

    public Muutoshistoria() {
        this.muutokset = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        muutokset.add(tilanne);
    }

    public void nollaa() {
        this.muutokset.clear();
    }

    @Override
    public String toString() {
        return this.muutokset + "";
    }

    public double maxArvo() {
        if (listaOnTyhja(this.muutokset)) {
            return 0;
        }
        return Collections.max(this.muutokset);
    }

    public double minArvo() {
        if (listaOnTyhja(this.muutokset)) {
            return 0;
        }
        return Collections.min(this.muutokset);
    }

    public double keskiarvo() {
        if (listaOnTyhja(this.muutokset)) {
            return 0;
        }
        return keskiarvo(this.muutokset);
    }

    public double suurinMuutos() {
        if (listaOnTyhja(this.muutokset) || this.muutokset.size() < 1) {
            return 0;
        }
        double suurinVali = 0;
        double tamaVali = 0;
        double edellinen = this.muutokset.get(0);
        for (double tama : this.muutokset) {
            tamaVali = Math.abs(tama - edellinen);
            suurinVali = Math.max(tamaVali, suurinVali);
            edellinen = tama;

        }
        return suurinVali;
    }

    public double varianssi() {
        double summattava = 0;
        for (double tama : this.muutokset) {

            summattava = summattava + Math.pow(tama - keskiarvo(this.muutokset), 2);
        }
        return summattava / (this.muutokset.size() - 1);
    }

    private boolean listaOnTyhja(List lista) {
        if (lista.isEmpty()) {
            return true;
        }
        return false;
    }

    private double keskiarvo(List<Double> lista) {
        double summa = 0;
        for (double tama : lista) {
            summa = summa + tama;

        }
        return summa / this.muutokset.size();
    }
}
