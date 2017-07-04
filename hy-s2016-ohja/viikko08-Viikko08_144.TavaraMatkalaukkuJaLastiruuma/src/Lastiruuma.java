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

public class Lastiruuma {

    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut;
    private int paino;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<Matkalaukku>();
        this.paino = 0;
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (this.maksimipaino >= this.paino + laukku.yhteispaino()) {
            matkalaukut.add(laukku);
            this.paino = this.paino + laukku.yhteispaino();
        }
    }

    public String toString() {
        int maara = 0;

        for (Matkalaukku eka : matkalaukut) {
            maara++;

        }
        return maara + " matkalaukkua" + " (" + this.paino + " kg)";
    }

    public void tulostaTavarat() {
        for (Matkalaukku eka : matkalaukut) {
            eka.tulostaTavarat();
        }
    }
}
