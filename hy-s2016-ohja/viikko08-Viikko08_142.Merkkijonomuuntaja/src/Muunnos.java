/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Muunnos {

    private char muunnettava;
    private char muunnettu;

    public Muunnos(char muunnettava, char muunnettu) {
        this.muunnettava = muunnettava;
        this.muunnettu = muunnettu;
    }

    public String muunna(String sana) {
        String muunnettavaSanana = String.valueOf(muunnettava);
        String muunnettuSanana = String.valueOf(muunnettu);

        String uusiSana = sana.replaceAll(muunnettavaSanana, muunnettuSanana);
        return uusiSana;
    }

}
