/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Pomo extends Tyontekija {

    public Pomo(String nimi, int palkka) {
        super(nimi, palkka);
    }

    public void lisaaAlainen(Tyontekija alainen) {
        this.alaiset.add(alainen);
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        if (super.onkoTaitoa(kieli)) {
            return true;
        }
        for (Tyontekija tama : this.alaiset) {
            if (tama.onkoTaitoa(kieli)) {
                return true;
            }
        }
        return false;
// toimiiko täysin??
    }

}
