
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Peli {

    private int tikut;
    public Scanner lukija;

    public Peli(Scanner lukija) {
        this.tikut = tikut;
        this.lukija = lukija;
    }

    public void aloita() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");

        aloitustoimet();

        while (true) {
            pelaaja1.pelaa(this);
            if (this.tikut == 0) {
                System.out.println("Pelaaja 1, hävisit :/");
                break;
            }
            pelaaja2.pelaa(this);
            if (this.tikut == 0) {
                System.out.println("Pelaaja 2, hävisit :/");
                break;
            }
        }
    }

    public void aloitustoimet() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");

        while (true) {
            System.out.println("Tervetuloa tikkupeliin!");
            System.out.print("Kuinka monta tikkua pöydällä on aluksi (10-100)? ");
            this.tikut = Integer.parseInt(lukija.nextLine());
            if (this.tikut > 9 && this.tikut < 101) {
                break;
            }
        }
        System.out.println("Pöydällä on " + this.tikut + " tikkua.");

    }

    public int getTikut() {
        return this.tikut;
    }

    public void vahennaTikkujenMaaraa(int uusiMaara) {
        this.tikut -= uusiMaara;
    }
}
