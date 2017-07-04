
import java.util.*;

public class Ohjelma {

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

}
