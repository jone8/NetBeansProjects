
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna ensimmäinen merkkijono: ");
        String eka = lukija.nextLine();
        System.out.print("Anna toinen merkkijono: ");
        String toinen = lukija.nextLine();
        String yhdessa = eka + toinen;
        System.out.println("Merkkijonojen " + eka + " ja " + toinen
                + " yhteispituus on " + yhdessa.length());
    }

}
