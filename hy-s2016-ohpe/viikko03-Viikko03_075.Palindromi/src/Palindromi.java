
import java.util.Scanner;

public class Palindromi {

    public static boolean palindromi(String merkkijono) {
      boolean palindromi = (merkkijono.equals(kaanna(merkkijono)));
   return palindromi;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        if (palindromi(merkkijono)) {
            System.out.println("Merkkijono on palindromi!");
        } else {
            System.out.println("Merkkijono ei ole palindromi!");
        }
    }
// Koodi, joka kääntää merkkijonon.

    public static String kaanna(String merkkijono) {
        int apu = merkkijono.length() - 1;
        String jono = "";
        char merkki = ' ';
        while (apu > -1) {
            merkki = merkkijono.charAt(apu);
            jono = jono + merkki;
            apu--;
        }
        return jono;
    }
}
