/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Pelaaja {

    String nimi;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }

    public void pelaa(Peli peli) {
        int maara = 0;
        while (true) {

            System.out.print(this.nimi + " :" + "Kuinka monta tikkua nostat (1-3)? ");
            maara = Integer.parseInt(peli.lukija.nextLine());
            if (maara > 0 && maara < 4 && peli.getTikut() >= maara) {
                break;
            }
        }
        peli.vahennaTikkujenMaaraa(maara);
        System.out.println("Pöydällä on " + peli.getTikut() + " tikkua.");

    }
}
