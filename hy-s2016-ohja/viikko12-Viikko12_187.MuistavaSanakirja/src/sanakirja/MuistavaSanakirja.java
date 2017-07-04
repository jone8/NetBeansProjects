/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kari
 */
public class MuistavaSanakirja {

    private Map<String, String> sanat;
    private File tiedosto;

    public MuistavaSanakirja() {
        this.sanat = new HashMap();

    }

    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = new File(tiedosto);
    }

    public void lisaa(String sana, String kaannos) {
        if (!this.sanat.containsKey(sana)) {
            this.sanat.put(sana, kaannos);
        }
    }

    public String kaanna(String sana) {
        if (this.sanat.containsKey(sana)) {
            return this.sanat.get(sana);
        }
        if (this.sanat.containsValue(sana)) {
            for (String tamaSana : this.sanat.keySet()) {
                if (sana.equals(this.sanat.get(tamaSana))) {
                    return tamaSana;
                }
            }
        }
        return null;
    }

    public void poista(String sana) {
        String poistettava = null;
        this.sanat.remove(sana);
        for (String tamaSana : this.sanat.keySet()) {
            if (sana.equals(this.sanat.get(tamaSana))) {
                poistettava = tamaSana;
            }
        }
        this.sanat.remove(poistettava);
    }

    public boolean lataa() {
        Scanner tiedostonLukija;
        try {
            tiedostonLukija = new Scanner(this.tiedosto);
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");

                this.sanat.put(osat[0], osat[1]);
            }

        } catch (FileNotFoundException ex) {
            return false;
        }
        return true;
    }

    public boolean tallenna() {
        FileWriter kirjoittaja;
        try {
            kirjoittaja = new FileWriter(tiedosto);
            for (String tamaSana : this.sanat.keySet()) {
                kirjoittaja.write(tamaSana + ":" + this.sanat.get(tamaSana) + "\n");
            }
            kirjoittaja.close();
        } catch (IOException ex) {
            return false;
        }

        return true;
    }

}
