
import java.util.*;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosanat kumpulanArvosanat = new Arvosanat();
        while (true) {
            System.out.println("Syötä koepisteet, -1 lopettaa:");

            int luku = Integer.parseInt(lukija.nextLine());

            if (luku != -1) {
                kumpulanArvosanat.lisaa(luku);

            } else {
                break;
            }

// tee ohjelmasi tänne
            // älä kuitenkaan tee kaikkea koodia mainiin, vaan suunnittele ohjelmalle järkevä rakenne
            // ÄLÄ tee ohjelmaasi muita Scannereita kuin tässä luotu
            // jos joudut käyttämään Scanneria muusta metodista, välitä se parametrina tehtävän 73 tapaan
        }
        kumpulanArvosanat.arvosanatTahtina();

    }
}
