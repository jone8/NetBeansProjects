
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtäviä 90.3 ja 90.4 tehdessäsi
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parillisetTilasto = new Lukutilasto();
        Lukutilasto parittomatTilasto = new Lukutilasto();
        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!

        System.out.println("Anna lukuja");

        int luku = 0;
        while (true) {
            luku = Integer.parseInt(lukija.nextLine());

            if (luku == -1) {
                break;
            }
            if (luku != -1) {
                tilasto.lisaaLuku(luku);
            }

            if (luku % 2 == 0) {
                parillisetTilasto.lisaaLuku(luku);
            }
            if (luku % 2 != 0) {
                parittomatTilasto.lisaaLuku(luku);
            }
        }
        System.out.println("summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parillisetTilasto.summa());
        System.out.println("Parittomien summa: " + parittomatTilasto.summa());
    }
}
