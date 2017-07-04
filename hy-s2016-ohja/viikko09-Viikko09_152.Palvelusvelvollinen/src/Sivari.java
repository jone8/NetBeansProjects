/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Sivari implements Palvelusvelvollinen {

    private int paivia;

    public Sivari() {
        this.paivia = 362;
    }

    public int getTJ() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        if (this.paivia > 0) {
            this.paivia--;
        }

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
