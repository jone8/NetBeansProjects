/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class YlhaaltaRajoitettuLaskuri {

    private int arvo;
    private int ylaRaja;

    public YlhaaltaRajoitettuLaskuri(int ylaRaja) {
        this.arvo = arvo;
        this.ylaRaja = ylaRaja;
    }

    public void seuraava() {
        if (this.arvo == this.ylaRaja) {
            this.arvo = 0;
        } else {
            this.arvo++;
        }
    }

    @Override
    public String toString() {
        if (this.arvo < 10) {
            return "0" + this.arvo;
        }
        return "" + this.arvo;
    }

    public int arvo() {
        return this.arvo;
    }

    public void asetaArvo(int arvo) {
        if (arvo >= 0 && arvo <= this.ylaRaja) {
            this.arvo = arvo;
        }
    }
}
