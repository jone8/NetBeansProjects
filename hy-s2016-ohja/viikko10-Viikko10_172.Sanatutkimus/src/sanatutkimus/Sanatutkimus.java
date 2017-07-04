/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanatutkimus;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kari
 */
public class Sanatutkimus {

    private File tiedosto;
    private List<String> rivit;

    public Sanatutkimus(File tiedosto) {
        this.tiedosto = tiedosto;
        this.rivit = new ArrayList<>();

        Scanner lukija = null;
        try {
            lukija = new Scanner(tiedosto, "UTF-8");
        } catch (Exception e) {
            System.out.println("Tiedoston lukemisessa tapahtui virhe" + e.getMessage());
            return;
        }
        while (lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }

        lukija.close();
    }

    public int sanojenMaara() {
        int maara = 0;
        for (String rivi : rivit) {
            maara++;
        }
        return maara;
    }

    public List<String> kirjaimenZSisaltavatSanat() {
        List<String> zLista = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.contains("z")) {
                zLista.add(rivi);
            }
        }
        return zLista;
    }

    public List<String> kirjaimeenLPaattyvatSanat() {
        List<String> LPaattyvatLista = new ArrayList<>();
        for (String rivi : rivit) {
            int viimeinenKirjain = rivi.length() - 1;
            if (rivi.charAt(viimeinenKirjain) == 'l') {
                LPaattyvatLista.add(rivi);
            }
        }
        return LPaattyvatLista;
    }

    public List<String> palindromit() {
        List<String> palindromiLista = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.equals(kaanna(rivi))) {
                palindromiLista.add(rivi);
            }
        }
        return palindromiLista;
    }

    public static String kaanna(String merkkijono) {
        int apu = merkkijono.length() - 1;
        String jono = "";
        char merkki = ' ';
        while (apu > -1) {
            merkki = merkkijono.charAt(apu);
            jono = jono + merkki;
            apu--;
        }
        return jono;
    }

    public List<String> kaikkiVokaalitSisaltavatSanat() {
        List<String> vokaalitLista = new ArrayList<>();
        for (String rivi : rivit) {
            if (rivi.contains("a") && rivi.contains("e") && rivi.contains("i")
                    && rivi.contains("o") && rivi.contains("u") && rivi.contains("y")
                    && rivi.contains("ä") && rivi.contains("ö")) {
                vokaalitLista.add(rivi);
            }

        }
        return vokaalitLista;
    }

    public void tulostaRivit() {

        for (String rivi : rivit) {

            {
                System.out.println(rivi);
            }
        }
    }
}
