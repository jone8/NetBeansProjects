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

public class Ympyra {

    private double x;
    private double y;
    private double sade;

    public Ympyra(double x, double y, double sade) {
        this.x = x;
        this.y = y;
        this.sade = sade;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getSade() {
        return this.sade;
    }

    public boolean osuuko(Ympyra toinen) {
        double ero = Math.pow(toinen.getX() - this.x, 2)
                + Math.pow(toinen.getY() - this.y, 2);
        double valimatka = Math.sqrt(ero);
        if (valimatka - this.sade - toinen.getSade() > 0) {
            return false;
        }
        return true;
    }
}
