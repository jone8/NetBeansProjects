
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        int apu = 0;
        int toinenApu = 1;
        while (apu < nimi.length()) {
            //char kirjain=nimi.charAt(0);
            System.out.println(toinenApu + ". Kirjain: " + nimi.charAt(apu));
            apu++;
            toinenApu++;
        }

//String nimi = lukija.nextLine();
        ///char eka=nimi.charAt(0);
        //if (nimi.length() > 2) {
        // System.out.println("1. kirjain: " + nimi.charAt(0));
        //System.out.println("2. kirjain: " + nimi.charAt(1));
        // System.out.println("3. kirjain: " + nimi.charAt(2));
        // } else {
        //System.out.println("");
        //}
    }
}
