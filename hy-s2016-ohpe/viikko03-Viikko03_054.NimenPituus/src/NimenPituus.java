
import java.util.Scanner;

public class NimenPituus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.println("Anna nimi:");
        String nimi = lukija.nextLine();
        System.out.println("Kirjaimäärä: " + laskeKirjaimet(nimi));
    }
    

// tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono) {
        return merkkijono.length();
    }

}
