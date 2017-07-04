/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilot;

/**
 *
 * @author Kari
 */
public class Opiskelija extends Henkilo {

    private int opintopistemaara;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopistemaara = 0;
    }

    public int opintopisteita() {
        return this.opintopistemaara;
    }

    public void opiskele() {
        this.opintopistemaara++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  " + "opintopisteitä " + this.opintopistemaara;
    }

}
