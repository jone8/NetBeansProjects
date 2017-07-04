/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarjestys;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kari
 */
public class Jarjestaja {
    
    private List<Kirja> kirjat;
    private Scanner lukija;
//public String kasky;

    public Jarjestaja(Scanner lukija) {
        this.kirjat = new ArrayList<>();
        
        this.lukija = lukija;

//        this.kasky="";
    }
    
    public void aloita() {
        
        kirjojenKerays();
        
        System.out.println("");
        System.out.println("Kiitos!\n"
                + "\n"
                + "Missä järjestyksessä kirjat tulostetaan?\n"
                + "  nimi -- nimen mukaan järjestettynä\n"
                + "  vuosi -- julkaisuvuoden mukaan järjestettynä\n"
                + "  molemmat -- nimen ja julkaisuvuoden mukaan järjestettynä");
        
        String uusiKasky = lukija.nextLine();
        for (Kirja tama : kirjat) {
            tama.muutaKaskya(uusiKasky);
       
        jarjesta();
        
        }
        
    }
    
    public void kirjojenKerays() {
        while (true) {
            
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.print("Syötä julkaisuvuosi:");
            int julkaisuvuosi = Integer.parseInt(lukija.nextLine());
            kirjat.add(new Kirja(nimi, julkaisuvuosi));
        }
    }
    
    public void jarjesta() {
        Collections.sort(kirjat);
        System.out.println("Kirjat järjestyksessä:");
        for (Kirja tamaKirja : kirjat) {
            System.out.println(tamaKirja);
        }
        
    }

    
    
}
