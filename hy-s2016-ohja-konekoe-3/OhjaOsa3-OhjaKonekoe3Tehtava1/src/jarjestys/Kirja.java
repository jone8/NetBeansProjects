/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarjestys;

/**
 *
 * @author Kari
 */
public class Kirja implements Comparable<Kirja> {

    private String nimi;
    private int julkaisuvuosi;
    private String kasky;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.kasky = "";
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }

    public String getKasky() {
        return this.kasky;
    }

    public void muutaKaskya(String uusiKasky) {
        this.kasky = uusiKasky;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.julkaisuvuosi + ") ";
    }

    private int nimenMukaan(Kirja o) {
        if (this.getNimi().compareToIgnoreCase(o.getNimi()) > 0) {
            return 1;
        }
        if (this.getNimi().compareToIgnoreCase(o.getNimi()) == 0) {
            return 0;
        }

        return -1;
    }

    private int vuodenMukaan(Kirja o) {
        return this.julkaisuvuosi - o.julkaisuvuosi;
    }

    private int molempienMukaan(Kirja o) {
        if (this.getNimi().compareToIgnoreCase(o.getNimi()) > 0) {
            return 1;
        }
        if (this.getNimi().compareToIgnoreCase(o.getNimi()) == 0) {
            vuodenMukaan(o);
            return 0;
        }

        return -1;
    }

    @Override
    public int compareTo(Kirja o) {
        int jarjestys = 0;

        if (this.kasky.equals("nimi")) {
            jarjestys = nimenMukaan(o);
        }
        if (this.kasky.equals("vuosi")) {
            jarjestys = vuodenMukaan(o);
        }
        if (this.kasky.equals("molemmat")) {
            jarjestys = molempienMukaan(o);
        }
        return jarjestys;
    }
}
