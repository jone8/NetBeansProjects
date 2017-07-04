package suosittelija;

import java.util.Arrays;
import java.util.List;
import suosittelija.domain.Henkilo;
import suosittelija.domain.Elokuva;

public class Main {

    public static void main(String[] args) {
Henkilo henkilo = new Henkilo("Pekka");
Elokuva elokuva = new Elokuva("Eraserhead");

System.out.println(henkilo.getNimi() + " ja " + elokuva.getNimi());
        System.out.println(henkilo);

// Testaa luokkiesi toteutusta täällä
    }
    }
