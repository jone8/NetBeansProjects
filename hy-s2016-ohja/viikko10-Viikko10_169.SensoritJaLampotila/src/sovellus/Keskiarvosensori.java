/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.*;
import java.util.Random;

/**
 *
 * @author Kari
 */
public class Keskiarvosensori implements Sensori {

    private List<Sensori> sensorit;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }

    @Override
    public boolean onPaalla() {
        for (Sensori eka : sensorit) {
            if (!eka.onPaalla()) {

                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        for (Sensori eka : sensorit) {
            eka.paalle();
        }
    }

    @Override
    public void poisPaalta() {
        for (Sensori eka : sensorit) {
            eka.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        int keskiarvo = 0;
        if (!this.onPaalla() || this.sensorit.size() == 0) {
            throw new IllegalStateException("Ei yhtään sensoria");
        }

        for (Sensori eka : sensorit) {
            keskiarvo = keskiarvo + eka.mittaa();

        }
        keskiarvo = keskiarvo / sensorit.size();
        mittaukset.add(keskiarvo);
        return keskiarvo;
    }

    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
//        lisattava = new Lampomittari();

    }

    public List<Integer> mittaukset() {
        return mittaukset;
    }

}
