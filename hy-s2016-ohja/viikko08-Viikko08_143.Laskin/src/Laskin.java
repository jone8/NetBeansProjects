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

public class Laskin {

    private Lukija lukija;

    public Laskin() {
        this.lukija = new Lukija();
    }
    private int statistiikka = 0;

    public void kaynnista() {
        while (true) {
            System.out.print("komento: ");
            String komento = lukija.lueMerkkijono();
            if (komento.equals("lopetus")) {
                break;
            }

            if (komento.equals("summa")) {
                summa();
            } else if (komento.equals("erotus")) {
                erotus();
            } else if (komento.equals("tulo")) {
                tulo();
            }
        }

        statistiikka();
    }

    private void summa() {
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();// luetaan luku käyttäen lukija-olioa
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku(); // luetaan luku käyttäen lukija-olioa
        System.out.println("lukujen summa " + (luku1 + luku2));
        statistiikka++;
// tulostetaan tulos ylläolevan esimerkin tapaan
    }

    private void erotus() {
        System.out.println("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.println("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        System.out.println("lukujen erotus " + (luku1 - luku2));
        statistiikka++;
    }

    private void tulo() {
        System.out.println("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.println("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        System.out.println("lukujen tulo " + (luku1 * luku2));
        statistiikka++;
    }

    private void statistiikka() {
        System.out.println("Laskuja laskettiin " + statistiikka);
    }
}
