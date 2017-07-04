
import java.util.Scanner;

public class MontaTulostusta {

    // HUOM: älä muuta metodin määrittelevää eli seuraavaa riviä!
    // (tässä tehtävässä ei ole vielä tarkoitus laittaa metodille parametria)
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");    // kirjoita koodia tähän
    }

    public static void main(String[] args) {
        System.out.println("Kuinka monta");// kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        int monta = Integer.parseInt(lukija.nextLine());
        int i = 1;
        while (i <= monta) {
            tulostaTeksti();
            i++;
        }
    }
}
