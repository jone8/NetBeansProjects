/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matopeli.domain;

import com.sun.corba.se.impl.orbutil.ORBConstants;
import matopeli.domain.Pala;
import java.util.ArrayList;
import java.util.List;
import matopeli.Suunta;

/**
 *
 * @author Kari
 */
public class Mato {

    private List<Pala> madonPalat;
    private int alkuX;
    private int alkuY;
    private Suunta alkuSuunta;
    private int kasvatetaankoMatoa;

    public Mato(int alkuX, int alkuY, Suunta alkuSuunta) {
        this.madonPalat = new ArrayList<>();
        this.madonPalat.add(new Pala(alkuX, alkuY));
        this.alkuX = alkuX;
        this.alkuY = alkuY;
        this.alkuSuunta = alkuSuunta;
        this.kasvatetaankoMatoa = 0;
    }

    public Suunta getSuunta() {
        return this.alkuSuunta;
    }

    public void setSuunta(Suunta suunta) {
        this.alkuSuunta = suunta;
    }

    public int getPituus() {
        return this.madonPalat.size();
    }

    public List<Pala> getPalat() {
        return this.madonPalat;
    }

    public void liiku() {

        if (this.alkuSuunta == Suunta.VASEN) {
            lisaaMatoonPala((getMadonPaaPalaX() - 1), getMadonPaaPalaY());
        } else if (this.alkuSuunta == Suunta.YLOS) {
            lisaaMatoonPala(getMadonPaaPalaX(), getMadonPaaPalaY() - 1);
        } else if (this.alkuSuunta == Suunta.OIKEA) {
            lisaaMatoonPala(getMadonPaaPalaX() + 1, getMadonPaaPalaY());
        } else if (this.alkuSuunta == Suunta.ALAS) {

            lisaaMatoonPala(getMadonPaaPalaX(), getMadonPaaPalaY() + 1);
        }
        if (this.kasvatetaankoMatoa == 0 && getPituus() > 3) {
            this.madonPalat.remove(0);
        }

        this.kasvatetaankoMatoa = 0;

    }

    public void kasva() {
        this.kasvatetaankoMatoa = 1;
    }

    public boolean osuu(Pala pala) {
        for (Pala tama : this.madonPalat) {
            if (tama.osuu(pala)) {
                return true;
            }
        }
        return false;
    }

    public boolean osuuItseensa() {
        for (Pala tama : this.madonPalat) {
            int monta = 0;
            for (Pala verrattava : this.madonPalat) {
                if (tama.osuu(verrattava)) {
                    monta++;
                }
            }
            if (monta > 1) {
                return true;
            }
        }
        return false;
    }

    public int getMadonPaaPalaX() {

        return this.madonPalat.get((this.madonPalat.size() - 1)).getX();
    }

    public int getMadonPaaPalaY() {
        return this.madonPalat.get((this.madonPalat.size() - 1)).getY();
    }

    public void lisaaMatoonPala(int x, int y) {
        this.madonPalat.add(new Pala(x, y));
    }
}
