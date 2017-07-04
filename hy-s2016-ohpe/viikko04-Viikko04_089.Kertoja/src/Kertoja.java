/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Kertoja {

    private int luku;

    public Kertoja(int annettuLuku) {
        this.luku = annettuLuku;

    }

    public int kerro(int toinenLuku) {
        return toinenLuku * luku;
    }
}
