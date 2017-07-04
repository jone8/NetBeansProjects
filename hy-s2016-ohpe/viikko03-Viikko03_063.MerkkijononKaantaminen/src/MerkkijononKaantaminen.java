
import java.util.Scanner;

public class MerkkijononKaantaminen {

    public static String kaanna(String merkkijono) {
        int apu = merkkijono.length() - 1;
        String jono = "";
        char merkki = ' ';
        while (apu > -1) {
            merkki = merkkijono.charAt(apu);
            jono = jono + merkki;
            apu--;
        }

// Kirjoita koodia tähän.
        // Metodin on siis palautettava käännetty merkkijono returnilla!
        return jono;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Väärinpäin: " + kaanna(merkkijono));
    }
}
