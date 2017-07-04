/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muuttaminen.domain;

/**
 *
 * @author Kari
 */
public class Esine implements Tavara, Comparable<Tavara> {

    private String nimi;
    private int tilavuus;

    public Esine(String nimi, int tilavuus) {
        this.nimi = nimi;
        this.tilavuus = tilavuus;
    }

    @Override
    public int getTilavuus() {
        return this.tilavuus;
    }

    public String getNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.tilavuus + " dm^3)";
    }

    public int compareTo(Esine verrattava) {
        return this.tilavuus - verrattava.getTilavuus();
    }

    @Override
    public int compareTo(Tavara o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
