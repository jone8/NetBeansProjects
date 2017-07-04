/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
import java.io.File;
import java.util.*;

public class Tulostaja {

    private String tiedostonNimi;
    private Scanner lukija;
    private ArrayList<String> rivit;

    public Tulostaja(String tiedostonNimi) throws Exception {
        this.tiedostonNimi = tiedostonNimi;
        this.lukija = new Scanner(new File(tiedostonNimi), "UTF-8");
        rivit = new ArrayList<>();

        while (lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }

        lukija.close();
    }

    public void tulostaRivitJoilla(String sana) {

        for (String eka : rivit) {

            if (eka.contains(sana)) {
                System.out.println(eka);
            }
        }
    }
}
