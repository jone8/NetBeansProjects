/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
import java.util.*;

public class Tietokanta {

    private ArrayList<Lintu> linnut;

    public Tietokanta() {
        this.linnut = new ArrayList<>();
    }

    public boolean havainto(String nimi) {
        for (Lintu lintu : this.linnut) {
            if (nimi.equals(lintu.nimi())) {
                lintu.havainto();
                return true;
            }
        }
        return false;
    }

    public void lisaa(String nimi, String latinankielinenNimi) {
        this.linnut.add(new Lintu(nimi, latinankielinenNimi));
    }

    public String nayta(String nimi) {
        for (Lintu lintu : this.linnut) {
            if (nimi.equals(lintu.nimi())) {
                return lintu.toString();
            }
        }
        return null;
    }

    public String tilasto() {
        String tilasto = "";
        for (Lintu lintu : this.linnut) {
            tilasto = tilasto + lintu.toString() + "\n";
        }
        return tilasto;
    }
}
