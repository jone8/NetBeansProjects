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

public class Sanakirja {

    private HashMap<String, String> sanakirja;

    public Sanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public String kaanna(String sana) {

        return sanakirja.get(sana);
    }

    public void lisaa(String sana, String kaannos) {
        sanakirja.put(sana, kaannos);
    }

    public int sanojenLukumaara() {
        return sanakirja.size();
    }

    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> kaannosLista = new ArrayList<>();
        for (String eka : sanakirja.keySet()) {
            kaannosLista.add(eka + " = " + sanakirja.get(eka));
        }
        return kaannosLista;
    }

}
