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

public class Ostoskori {

    private Map<String, Ostos> ostoskorinSisalto;

    public Ostoskori() {
        this.ostoskorinSisalto = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (!ostoskorinSisalto.containsKey(tuote)) {
            ostoskorinSisalto.put(tuote, new Ostos(tuote, 1, hinta));
        } else {
            ostoskorinSisalto.get(tuote).kasvataMaaraa();
        }
    }

    public int hinta() {
        int hinta = 0;
        for (Ostos eka : this.ostoskorinSisalto.values()) {
            hinta = hinta + eka.hinta();
        }
        return hinta;
    }

    public void tulosta() {
        for (Ostos eka : this.ostoskorinSisalto.values()) {
            System.out.println(eka);
        }
    }

}
