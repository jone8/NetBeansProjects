package muuttaminen;

import java.util.*;
import muuttaminen.domain.Esine;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;
import muuttaminen.logiikka.Pakkaaja;

public class Main {

    public static void main(String[] args) {
        // testaa ohjelmasi toimintaa täällä

        List<Tavara> tavarat = new ArrayList<>();
        tavarat.add(new Esine("passi", 2));
        tavarat.add(new Esine("hammasharja", 1));
        tavarat.add(new Esine("kirja", 4));
        tavarat.add(new Esine("sirkkeli", 8));

// luodaan pakkaaja, joka käyttää tilavuudeltaan 10:n kokoisia muuttolaatikoita
        Pakkaaja pakkaaja = new Pakkaaja(10);
        List<Muuttolaatikko> laatikot = pakkaaja.pakkaaTavarat(tavarat);

// pyydetään pakkaajaa pakkaamaan tavarat laatikoihin
        System.out.println("laatikoita: " + laatikot.size());

        for (Muuttolaatikko laatikko : laatikot) {
            System.out.println("  laatikossa tavaraa: " + laatikko.getTilavuus() + " dm^3");
        }

    }
}
