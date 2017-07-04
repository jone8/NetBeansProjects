
import java.util.*;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};

        jarjesta(taulukko);

    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int eka : taulukko) {
            if (eka < pienin) {
                pienin = eka;
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int indeksi = 0;
        for (int eka : taulukko) {
            if (eka != pienin(taulukko)) {
                indeksi++;
            } else {
                break;
            }
        }
        return indeksi;
    }

    public static int pieninAlkaen(int[] taulukko, int aloitusIndeksi) {
        int i = aloitusIndeksi;
        int pienin = taulukko[aloitusIndeksi];
        int verrattava = taulukko[i];
        for (i = aloitusIndeksi; i < taulukko.length; i++) {
            verrattava = taulukko[i];
            if (verrattava < pienin) {
                pienin = verrattava;
            }

// kirjoita koodia tähän
        }

        return pienin;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int i = aloitusIndeksi;
        int indeksi = aloitusIndeksi;
        for (i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] != pieninAlkaen(taulukko, aloitusIndeksi)) {
                indeksi++;
            } else {
                break;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int ekaVaihdettava = taulukko[indeksi1];
        int tokaVaihdettava = taulukko[indeksi2];
        taulukko[indeksi1] = tokaVaihdettava;
        taulukko[indeksi2] = ekaVaihdettava;

// kirjoita koodia tähän
    }

    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) //pienimmanIndeksiAlkaen(taulukko, i);
        {
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
        }
    }

}
