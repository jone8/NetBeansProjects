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

public class Joukkue {

    private String nimi;
    private ArrayList<Pelaaja> joukkueenPelaajat;
    private int maksimikoko;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.joukkueenPelaajat = new ArrayList<>();
        this.maksimikoko = 16;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public void lisaaPelaaja(Pelaaja uusiPelaaja) {
        if (this.koko() < maksimikoko) {
            joukkueenPelaajat.add(uusiPelaaja);

        }
    }

    public void tulostaPelaajat() {
        for (Pelaaja eka : joukkueenPelaajat) {
            System.out.println(eka);
        }
    }

    public void asetaMaksimikoko(int maksimikoko) {
        this.maksimikoko = maksimikoko;
    }

    public int koko() {
        int pelaajamaara = 0;
        for (Pelaaja eka : joukkueenPelaajat) {
            pelaajamaara++;
        }
        return pelaajamaara;
    }

    public int maalit() {
        int maalimaara = 0;
        for (Pelaaja eka : joukkueenPelaajat) {

            maalimaara = maalimaara + this.maalit();
        }
        return maalimaara;
    }
}
