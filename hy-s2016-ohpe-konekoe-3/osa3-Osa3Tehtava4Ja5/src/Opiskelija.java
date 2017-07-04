
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
public class Opiskelija {

    private String nimi;
    private ArrayList<Kurssisuoritus> kurssilista;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
        this.kurssilista = new ArrayList<>();
    }

    public void suorita(String kurssi, int arvosana, int opintopisteet) {
        Kurssisuoritus suoritus = new Kurssisuoritus(kurssi, arvosana, opintopisteet);
        kurssilista.add(suoritus);
    }

    public int opintopisteita() {
        int pisteetyhteensa = 0;
        for (Kurssisuoritus eka : this.kurssilista) {
            pisteetyhteensa = pisteetyhteensa + eka.getOpintopisteet();

        }
        return pisteetyhteensa;
    }

    public void suoritusote() {
        System.out.println(this.nimi);
        for (Kurssisuoritus eka : this.kurssilista) {
            System.out.println(eka);

        }
        System.out.println("Opintopisteitä: " + this.opintopisteita());
    }
}
