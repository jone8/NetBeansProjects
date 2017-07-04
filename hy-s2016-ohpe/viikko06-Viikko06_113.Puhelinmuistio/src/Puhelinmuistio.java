/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
import java.util.ArrayList;

public class Puhelinmuistio {

    private ArrayList<Henkilo> muistio;

    public Puhelinmuistio() {
        this.muistio = new ArrayList<>();
    }

    public void lisaa(String nimi, String numero) {
        Henkilo uusi = new Henkilo(nimi, numero);
        this.muistio.add(uusi);
    }

    public void tulostaKaikki() {
        for (Henkilo eka : muistio) {
            System.out.println(eka);
        }
    }

    public String haeNumero(String nimi) {
        int i = 0;
        String tulostettava = "";
        for (Henkilo eka : muistio) {

            if (eka.haeNimi().equals(nimi)) {
                i++;
                tulostettava = eka.haeNumero();
            }
        }
        if (i <= 0) {
            return ("numero ei tiedossa");
        }
        
        
        return tulostettava;
    }

}
