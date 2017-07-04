
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syöte: ");
        String syote = lukija.nextLine();
        jakajaMerkki(syote);
    }

    public static String kaanna(String merkkiJono) {
        String kaannetty = "";
        int apu = 0;
        while (apu < merkkiJono.length()) {
            char merkki = merkkiJono.charAt(apu);
            kaannetty = merkki + kaannetty;
            apu++;
        }
        return kaannetty;
    }

    public static boolean palindromi(String merkkijono) {
        // kirjoita koodia tähän
        // Sana on palindromi jos se on sama kuin sama sana käännettynä
        boolean onkoPalindromi = merkkijono.equals(kaanna(merkkijono));
        return onkoPalindromi;
    }

    public static void jakajaMerkki(String merkkijono) {
        if (!palindromi(merkkijono)) {
            System.out.println("Ei palindromi");
        } else if (pariton(merkkijono)) {
            int keskimmainen = merkkijono.length() / 2;
            System.out.println("Palindromin jakajamerkki on " + merkkijono.charAt(keskimmainen));
        } else {
            System.out.println("Ei jakajamerkkiä");
        }

    }

    public static boolean pariton(String merkkijono) {
        if (merkkijono.length() % 2 == 0) {
            return false;
        }
        return true;
    }
}
