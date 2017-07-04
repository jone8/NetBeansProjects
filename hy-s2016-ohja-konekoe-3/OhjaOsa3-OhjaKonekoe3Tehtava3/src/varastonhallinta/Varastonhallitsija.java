/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastonhallinta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kari
 */
public class Varastonhallitsija {

    private Scanner lukija;

    private HashMap<String, ArrayList> varastot;

    public Varastonhallitsija(Scanner lukija) {
        this.lukija = lukija;
        varastot = new HashMap<>();
    }

    public void aloita() {
        System.out.println("Varastonhallinta!\n"
                + "\n"
                + "Komennot: \n"
                + "  lisaa (varasto) (esine) -- lisää esineen varastoon\n"
                + "  listaa (varasto) -- listaa kaikki annetun varaston esineet\n"
                + "  hae (varasto) (esine) -- kertoo onko varastossa haettua esinettä\n"
                + "  poista (varasto) (esine) -- poistaa yhden esineen annetusta varastosta\n"
                + "  lopeta -- lopettaa ohjelman suorituksen\n"
                + "\n"
                + "\n");

        while (true) {
            System.out.println("Syötä komento: ");

            String syote = lukija.nextLine();
            String[] palat = syote.split(" ");

            
          
           
               String komento = palat[0];
            
            String varasto = "";
//            if (palat.length == 2) {
                varasto = palat[1];
//            }
            String esine = "";
//            if (palat.length >= 3) {
                esine = palat[2];
//            }

            if (komento.equals("lisaa")) {
                lisaa(varasto, esine);
            }

            if (komento.equals("listaa")) {
                listaa(varasto, varastot);
            }

            if (komento.equals("hae")) {
                hae(varasto, esine);
            }
            if (komento.equals("poista")) {
                poista(varasto, esine, varastot);
            }
            if (komento.equals("lopeta")) {
                break;
            }
//            else{
//                System.out.println("Komentoa ei löydy");
//            }
        }
    }

    public void hae(String varasto, String esine) {

        if (varastot.get(varasto).contains(esine)) {
            System.out.println("Esinettä " + esine + "löytyy varastosta "
                    + varasto);
        } else {
            System.out.println("Esinettä " + esine + "löytyy varastosta "
                    + varasto);
        }

    }

    public void lisaa(String varasto, String esine) {
        if (!varastot.containsKey(varasto)) {
            varastot.put(varasto, new ArrayList<>());
            varastot.get(varasto).add(esine);
        } else {
            varastot.get(varasto).add(esine);
        }
    }

    public void listaa(String varasto, HashMap<String, ArrayList> varastot) {
        for (String tama : varastot.keySet()) {
            if (tama.equals(varasto)) {
                for (Object nama : varastot.get(tama)) {
                    System.out.println(nama);
                }
            }
        }
    }

    public void poista(String varasto, String esine, HashMap esineet) {
        varastot.get(varasto).remove(esine);
    }

}
