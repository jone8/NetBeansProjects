/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Tehtava {

    String tehtava;
    String onkoTehty;

    public Tehtava(String tehtava) {
        this.tehtava = tehtava;
        this.onkoTehty = "ei tehty";
    }

    public void asetaTehdyksi() {
        this.onkoTehty = "tehty";
    }

    public void asetaTekemattomaksi() {
        this.onkoTehty = "ei tehty";
    }

    public String toString() {
        return this.tehtava + "(" + this.onkoTehty + ")";
    }

    public String getonkoTehty() {
        return this.onkoTehty;
    }
}
