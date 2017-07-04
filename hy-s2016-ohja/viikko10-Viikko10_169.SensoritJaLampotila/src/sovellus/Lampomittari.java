/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.*;

/**
 *
 * @author Kari
 */
public class Lampomittari implements Sensori {

    private int paalla;

    public Lampomittari() {
        this.paalla = 0;
    }

    @Override
    public boolean onPaalla() {

        if (paalla == 1) {
            return true;

        }
        return false;
    }

    @Override
    public void paalle() {
        paalla = 1;
    }

    @Override
    public void poisPaalta() {
        paalla = 0;
    }

    @Override
    public int mittaa() {
        Random arpoja = new Random();
        if (paalla == 1) {
            return arpoja.nextInt(60) - 30;
        }
        throw new IllegalStateException("Lampomittari ei ole päällä.");
    }

}
