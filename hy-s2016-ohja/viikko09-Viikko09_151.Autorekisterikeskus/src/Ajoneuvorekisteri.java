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

public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        return omistajat.get(rekkari);
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero eka : omistajat.keySet()) {
            System.out.println(eka);
        }
    }

    public void tulostaOmistajatt() {
        ArrayList<String> tulostettava = new ArrayList<>();
        for (Rekisterinumero eka : omistajat.keySet()) {
            if (!tulostettava.equals(hae(eka))) {
                tulostettava.add(hae(eka));
            }
            for (String tama : tulostettava) {
                System.out.println(tama);
            }
        }
    }

    public void tulostaOmistajat() {
        Set<String> tulostettava = new HashSet<>();
        for (Rekisterinumero eka : omistajat.keySet()) {
            tulostettava.add(hae(eka));
        }
        for (String alkio : tulostettava) {
            System.out.println(alkio);
        }
    }
}
