/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyysi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kari
 */
public class TiedostonAnalysoija {

    private File tiedosto;
    private List<String> sanat;

    public TiedostonAnalysoija() {
        this.sanat = new ArrayList<>();
    }

    public void kaynnista() {
        System.out.println("Anna analysoitavan tiedoston nimi:");
        lue();
        laskeSanat();
        laskeUniikitSanat();
    }

    public void lue() {

        String annettuTiedosto;
        Scanner lukija = new Scanner(System.in);
        annettuTiedosto = lukija.nextLine();
        System.out.println("\nAnalysoidaan tiedostoa " + annettuTiedosto + "\n");
        try {
            Scanner tiedostonLukija = new Scanner(new File(annettuTiedosto));
            while (tiedostonLukija.hasNext()) {
                this.sanat.add(tiedostonLukija.next());

            }
            tiedostonLukija.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa " + annettuTiedosto + " ei löydy.\n");
        }

    }

    public void laskeSanat() {
        System.out.println("Sanoja: " + this.sanat.size());
    }

    public void laskeUniikitSanat() {
        List<String> uniikitSanat = new ArrayList<>();
        for (String tamaSana : this.sanat) {
            int montako = 0;
            for (String vertailtavaSana : this.sanat) {
                if (tamaSana.equalsIgnoreCase(vertailtavaSana)) {
                    montako++;
                }
            }
            if (montako < 2) {
                uniikitSanat.add(tamaSana);

            }

        }
        System.out.println("Uniikkeja: " + uniikitSanat.size());
    }
}
