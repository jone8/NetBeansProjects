/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Asevelvollinen implements Palvelusvelvollinen {

    private int palvelusaika;

    public Asevelvollinen(int palvelusaika) {
        this.palvelusaika = palvelusaika;
    }

    @Override
    public int getTJ() {
        return this.palvelusaika;
    }

    @Override
    public void palvele() {
        if (this.palvelusaika > 0) {
            this.palvelusaika--;
        }
    }

}
