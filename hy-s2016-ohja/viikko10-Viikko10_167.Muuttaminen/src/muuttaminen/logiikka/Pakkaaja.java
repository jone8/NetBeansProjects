/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.logiikka;

/**
 *
 * @author Kari
 */
import java.util.*;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;

public class Pakkaaja {

    private int laatikoidenTilavuus;

    public Pakkaaja(int laatikoidenTilavuus) {
        this.laatikoidenTilavuus = laatikoidenTilavuus;
    }

    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
////   Muuttolaatikko laatikko=new Muuttolaatikko(this.laatikoidenTilavuus);
        List<Muuttolaatikko> laatikot = new ArrayList();
        for (Tavara eka : tavarat) {
            Muuttolaatikko laatikko = new Muuttolaatikko(this.laatikoidenTilavuus);
            laatikko.lisaaTavara(eka);
            laatikot.add(laatikko);
        }
        return laatikot;
    }

}
