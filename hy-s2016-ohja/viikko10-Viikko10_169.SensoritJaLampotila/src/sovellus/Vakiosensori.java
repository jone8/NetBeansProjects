/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author Kari
 */
public class Vakiosensori implements Sensori {

    private int kokonaisluku;

    public Vakiosensori(int kokonaisluku) {
        this.kokonaisluku = kokonaisluku;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {

    }

    @Override
    public void poisPaalta() {

    }

    @Override
    public int mittaa() {
        return this.kokonaisluku;
    }

}
