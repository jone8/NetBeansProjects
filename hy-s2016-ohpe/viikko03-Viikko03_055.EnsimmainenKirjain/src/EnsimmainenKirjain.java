
import java.util.Scanner;

public class EnsimmainenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //String luku="bana";
        // System.out.println(luku.charAt(0));

        System.out.print("Anna nimi:");
        String nimi = lukija.nextLine();
        System.out.println("Ensimmainen kirjain: " + ensimmainenKirjain(nimi));

    }

    public static char ensimmainenKirjain(String merkkijono) {
        return merkkijono.charAt(0);
    }
}
