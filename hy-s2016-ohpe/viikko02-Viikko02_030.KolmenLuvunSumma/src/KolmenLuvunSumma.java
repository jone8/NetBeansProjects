
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettu;
        System.out.println("Anna ensimmäinen luku:");
        luettu= Integer.parseInt(lukija.nextLine());
        summa=luettu;     
        System.out.println("Anna toinen luku:");
        luettu= Integer.parseInt(lukija.nextLine());    
        summa=summa+luettu;
        System.out.println("Anna kolmas luku:");
        luettu=Integer.parseInt(lukija.nextLine());
        summa=summa+luettu;
        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija, summa JA luettu!

        System.out.println("Summa: " + summa);
    }
}
