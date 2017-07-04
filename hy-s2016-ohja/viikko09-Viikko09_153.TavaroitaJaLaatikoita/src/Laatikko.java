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

public class Laatikko implements Talletettava {

    private ArrayList<Talletettava> tavarat;
    private double maksimikilot;

    public Laatikko(double maksimikilot) {

        this.tavarat = new ArrayList<Talletettava>();
        this.maksimikilot = maksimikilot;
    }

    public void lisaa(Talletettava talletettava) {
        if (maksimikilot >= talletettava.paino() + paino()) {
            tavarat.add(talletettava);
        }
    }

    public double paino() {
        double paino = 0;

        for (Talletettava eka : tavarat) {
            paino = paino + eka.paino();
        }

// laske laatikkoon talletettujen tavaroiden yhteispaino
        return paino;
    }

    public int esineidenMaara() {
        int esineidenMaara = 0;
        for (Talletettava eka : tavarat) {
            esineidenMaara++;
        }
        return esineidenMaara;
    }

    @Override
    public String toString() {
        return "Laatikko: " + esineidenMaara() + " esinettä, " + "paino yhteensä " + paino() + " kiloa";
    }

}
