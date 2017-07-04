/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
import java.util.ArrayList;

public class Ostoslista {

    private ArrayList<String> lista;

    public Ostoslista() {
        this.lista = new ArrayList<>();
    }

    public void lisaa(String tuote) {
        lista.add(tuote);
    }

    public int kappalemaara(String tuote) {
        int i = 0;
        for (String eka : lista) {
            if (eka.equals(tuote)) {
                i++;
            }
        }
        return i;
    }

    public void poista(String tuote) {
        lista.remove(tuote);
    }
}
