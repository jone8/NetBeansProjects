
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Kirjasto {

    private ArrayList<Kirja> kirjat;

    public Kirjasto() {
        this.kirjat = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja) {
        this.kirjat.add(uusiKirja);
    }

    public void tulostaKirjat() {
        for (Kirja eka : kirjat) {
            System.out.println(eka);
        }
    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja eka : this.kirjat) {
            if (StringUtils.sisaltaa(eka.nimeke(), nimeke)) {
                loydetyt.add(eka);
            }

        }
        // käy läpi kaikki kirjat ja lisää ne joilla haetun kaltainen nimeke listalle loydetyt

        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja eka : this.kirjat) {
            if (StringUtils.sisaltaa(eka.julkaisija(), julkaisija)) {
                loydetyt.add(eka);
            }

        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja eka : this.kirjat) {
            if (eka.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(eka);
            }

        }
        return loydetyt;
    }
}
