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

public class Piste {

    private double x;
    private double y;

    public Piste(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double etaisyys(Piste toinen) {
        double ero = Math.pow(toinen.getX() - this.x, 2)
                + Math.pow(toinen.getY() - this.y, 2);
        double valimatka = Math.sqrt(ero);
        return valimatka;

    }
}
