/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Laskuri {

    private int alkuarvo;
    private boolean tarkistus;

    public Laskuri(int alkuarvo, boolean tarkistus) {
        this.alkuarvo = alkuarvo;
        this.tarkistus = tarkistus;
    }

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }

    public Laskuri(boolean tarkistus) {
        this(0, tarkistus);
    }

    public Laskuri() {
        this(0, false);
    }

    public int arvo() {
        return this.alkuarvo;
    }

    public void lisaa() {
        this.lisaa(1);
    }

    public void vahenna() {
        this.vahenna(1);
    }

    public void lisaa(int lisays) {
        if (lisays > 0) {
            this.alkuarvo = this.alkuarvo + lisays;
        } else {
            this.alkuarvo = this.alkuarvo;
        }
    }

    public void vahenna(int vahennys) {
        if (vahennys < 0) {
            this.alkuarvo = this.alkuarvo;
        } else if (!tarkistus || this.alkuarvo - vahennys > -1) {
            this.alkuarvo = this.alkuarvo - vahennys;
        } else {
            this.alkuarvo = 0;
        }
    }

}
