/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.domain;

import java.util.*;

/**
 *
 * @author Kari
 */
public class Muuttolaatikko implements Tavara {

    private int maksimitilavuus;
    private List<Tavara> muuttotavarat;

    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.muuttotavarat = new ArrayList<Tavara>();
    }

    public boolean lisaaTavara(Tavara tavara) {
        if (this.getTilavuus() + tavara.getTilavuus() <= this.maksimitilavuus) {
            muuttotavarat.add(tavara);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getTilavuus() {
        int tilavuus = 0;
        for (Tavara eka : muuttotavarat) {
            tilavuus = tilavuus + eka.getTilavuus();
        }
        return tilavuus;
    }

}
