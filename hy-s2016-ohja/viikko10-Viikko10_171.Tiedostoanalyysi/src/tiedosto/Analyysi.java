/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedosto;

import java.io.File;
import java.util.*;

/**
 *
 * @author Kari
 */
public class Analyysi {

    private Scanner lukija;
    private ArrayList<String> rivit;
//    private File tiedosto;

    public Analyysi(File tiedosto) {
//   this.tiedosto = tiedosto;
        String rivi = "";
        this.rivit = new ArrayList<>();
        Scanner lukija = null;
        try {
            lukija = new Scanner(tiedosto);
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui. Virhe: "
                    + e.getMessage());
            return;
        }
        while (lukija.hasNextLine()) {
            rivi = lukija.nextLine();
            rivit.add(rivi);
        }

        lukija.close();

    }

    public int rivimaara() {

        int rivimaara = 0;
        for (String eka : rivit) {
            rivimaara++;
        }
        return rivimaara;
    }

    public int merkkeja() {
        int merkkeja = 0;
        for (String eka : rivit) {
            merkkeja = merkkeja + eka.length()+1;
        }
        return merkkeja;
    }
}
