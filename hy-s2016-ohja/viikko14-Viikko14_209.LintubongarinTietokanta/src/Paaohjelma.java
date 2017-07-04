
import java.util.*;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Tietokanta linnusto = new Tietokanta();

        while (true) {
            String komento = kysy(lukija, "?");

            if (komento.equals("Lopeta")) {
                break;
            } else if (komento.equals("Lisaa")) {
                lisaa(lukija, linnusto);
            } else if (komento.equals("Havainto")) {
                havainto(lukija, linnusto);
            } else if (komento.equals("Nayta")) {
                nayta(lukija, linnusto);
            } else if (komento.equals("Tilasto")) {
                tilasto(lukija, linnusto);
            } else {
                System.out.println("Tuntematon komento!");
            }
        }

    }

    public static String kysy(Scanner lukija, String kysymys) {
        System.out.print(kysymys + " ");
        return lukija.nextLine();
    }

    public static void lisaa(Scanner lukija, Tietokanta ltk) {
        String nimi = kysy(lukija, "Nimi:");
        String latNimi = kysy(lukija, "Latinankielinen nimi:");

        ltk.lisaa(nimi, latNimi);
    }

    public static void havainto(Scanner lukija, Tietokanta ltk) {
        String nimi = kysy(lukija, "Nimi:");

        boolean onnistuiko = ltk.havainto(nimi);
        if (!onnistuiko) {
            System.out.println(nimi + " ei ole lintu!");
        }
    }

    public static void nayta(Scanner lukija, Tietokanta ltk) {
        String nimi = kysy(lukija, "Nimi:");
        String mjono = ltk.nayta(nimi);
        if (mjono == null) {
            System.out.println(nimi + " ei ole lintu!");
        } else {
            System.out.println(mjono);
        }
    }

    public static void tilasto(Scanner lukija, Tietokanta ltk) {
        System.out.print(ltk.tilasto());
    }

}
