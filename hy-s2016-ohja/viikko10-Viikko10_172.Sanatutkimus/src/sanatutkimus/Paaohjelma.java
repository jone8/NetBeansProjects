package sanatutkimus;

import java.io.File;

public class Paaohjelma {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä

        File tiedosto = new File("src/pienilista.txt");
        Sanatutkimus tutk = new Sanatutkimus(tiedosto);
//        System.out.println(tiedosto);
//        System.out.println(tutk.sanojenMaara());
        System.out.println(tutk.kirjaimenZSisaltavatSanat());// kaikki sanat tiedostossa src/sanalista.txt
        System.out.println(tutk.kirjaimeenLPaattyvatSanat());
        System.out.println(tutk.palindromit());
        System.out.println(tutk.kaikkiVokaalitSisaltavatSanat());
    }
}
