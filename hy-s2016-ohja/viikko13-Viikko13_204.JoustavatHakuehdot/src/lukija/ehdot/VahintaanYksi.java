/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lukija.ehdot;

import java.util.*;

/**
 *
 * @author Kari
 */
public class VahintaanYksi implements Ehto {

    Ehto[] ehdot;

    public VahintaanYksi(Ehto... ehdot) {
        this.ehdot=ehdot;

    }

    @Override
    public boolean toteutuu(String rivi) {
        for (Ehto tama : this.ehdot) {
            if (tama.toteutuu(rivi)) {
                return true;
            }
        }
        return false;
    }

}
