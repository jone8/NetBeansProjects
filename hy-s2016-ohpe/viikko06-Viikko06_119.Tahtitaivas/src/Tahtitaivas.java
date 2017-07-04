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

public class Tahtitaivas {

    private double tiheys;
    private int leveys;
    private int korkeus;
    private int tahtiaViimeTulostuksessa;

    public Tahtitaivas(double tiheys) {
        this(tiheys, 20, 10);
    }

    public Tahtitaivas(int leveys, int korkeus) {
        this(0.1, leveys, korkeus);
    }

    public Tahtitaivas(double tiheys, int leveys, int korkeus) {
        this.tiheys = tiheys;
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public void tulostaRivi() {
        Random tahti = new Random();
        for (int kauanko = this.leveys; kauanko > 0; kauanko--) {
            double tahtiVaiEi = tahti.nextDouble();
            if (tahtiVaiEi < tiheys) {
                System.out.print("*");
                this.tahtiaViimeTulostuksessa++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void tulosta() {
        this.tahtiaViimeTulostuksessa = 0;
        for (int kauanko = this.korkeus; kauanko > 0; kauanko--) {
            tulostaRivi();
            System.out.println();
        }
    }

    public int tahtiaViimeTulostuksessa() {
        return this.tahtiaViimeTulostuksessa;
    }
}
