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

public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<Lahja>();

    }

    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);

    }

    public int getPaino() {
        int yhteisPaino = 0;
        for (Lahja eka : lahjat) {
            yhteisPaino = yhteisPaino + eka.getPaino();
        }
        return yhteisPaino;
    }
}
