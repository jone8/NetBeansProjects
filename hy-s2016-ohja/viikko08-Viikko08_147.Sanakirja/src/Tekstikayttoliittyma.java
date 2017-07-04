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

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {
        System.out.println("Komennot:\n lisaa - lisää sanaparin sanakirjaan\n"
                + " kaanna - kysyy sanan ja tulostaa sen käännöksen"
                + "\n lopeta - poistuu käyttöliittymästä\n");
        while (true) {
            System.out.print("Komento:");
            String komento = lukija.nextLine();

            if (komento.contains("lisaa")) {
                lisaa();
            } else if (komento.contains("kaanna")) {
                kaanna();
            } else if (komento.contains("lopeta")) {
                break;
            } else {
                System.out.println("Tuntematon komento.");
            }

        }

    }

    public void lisaa() {

        System.out.println("Suomeksi:");
        String suomeksi = lukija.nextLine();
        System.out.println("Käännös");
        String kaannos = lukija.nextLine();
        this.sanakirja.lisaa(suomeksi, kaannos);

    }

    public void kaanna() {

        System.out.println("Anna sana:");
        System.out.println("Käännös:" + this.sanakirja.kaanna(lukija.nextLine()));

    }

}
