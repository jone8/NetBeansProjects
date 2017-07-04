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

public class Tehtavalista {

    private ArrayList lista;

    public Tehtavalista() {
        this.lista = new ArrayList<Tehtava>();
    }

    public void lisaa(String tehtava) {
        this.lista.add(new Tehtava(tehtava));
    }

    public String toString() {
        String tuloste = "";
        String tulostettava = "";
        for (int apu = 0; apu < this.lista.size(); apu++) {
            tuloste = "-" + this.lista.get(apu);
            tulostettava = tuloste + "\n" + tulostettava;
        }

        return "Tehtävät \n" + tulostettava;

    }

    public void asetaTehdyksi(String tehtava) {

    }

}
