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

public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    private int paino;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<Tavara>();
        this.paino = 0;

    }

    public void lisaaTavara(Tavara tavara) {
        if (this.maksimipaino >= this.paino + tavara.getPaino()) {
            tavarat.add(tavara);
            this.paino = this.paino + tavara.getPaino();

        }

    }

    public String toString() {
        int maara = 0;

        for (Tavara eka : tavarat) {
            maara++;
        }
        if (maara == 0) {
            return "ei tavaroita (0kg)";
        } else if (maara == 1) {
            return "1 tavara" + " (" + this.paino + " kg)";
        } else {
            return maara + " tavaraa" + " (" + this.paino + " kg)";
        }
    }

    public void tulostaTavarat() {
        for (Tavara eka : tavarat) {
            System.out.println(eka);
        }
    }

    public int yhteispaino() {
        return this.paino;
    }

    public Tavara raskainTavara() {
        Tavara raskain = null;
        int raskainPaino = 0;
        for (Tavara eka : tavarat) {
            if (eka.getPaino() > raskainPaino) {
                raskainPaino = eka.getPaino();
                raskain = eka;
            }
        }
        return raskain;
    }

}
