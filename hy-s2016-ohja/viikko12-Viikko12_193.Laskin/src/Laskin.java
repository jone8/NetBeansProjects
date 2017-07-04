/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Laskin {

    int arvo;

    public Laskin() {
        this.arvo = 0;
    }

    public int plussaa(int eka, int toka) {
        this.arvo = eka + toka;
        return this.arvo;
    }

    public int miinusta(int syotettyArvo) {
        this.arvo = this.arvo - syotettyArvo;
        return this.arvo;
    }

    public void nollaa() {
        this.arvo = 0;
    }

    public int getArvo() {
        return this.arvo;
    }
}
