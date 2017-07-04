/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilosto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kari
 */
public class Tyontekijat {

    private List<Henkilo> henkilot;

    public Tyontekijat() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo henkilo) {
        henkilot.add(henkilo);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        for (Henkilo tamaHenkilo : lisattavat) {
            lisaa(tamaHenkilo);
        }
    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            Henkilo tama = iteraattori.next();
            if (tama.getKoulutus() == koulutus) {
                System.out.println(tama);
            }
        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
    }

}
