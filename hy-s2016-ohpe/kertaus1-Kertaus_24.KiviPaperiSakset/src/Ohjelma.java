
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Pelaaja 1, kerro nimesi");
        String pelaaja1 = lukija.nextLine();
        System.out.println("Pelaaja 2, kerro nimesi");
        String pelaaja2 = lukija.nextLine();

        System.out.println(pelaaja1 + ", valitse kivi/ paperi/ sakset");
        String ekanSiirto = lukija.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println(pelaaja2 + ", valitse kivi/ paperi/ sakset");
        String tokanSiirto = lukija.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println(kumpiVoittaa(pelaaja1, ekanSiirto, pelaaja2,
                tokanSiirto));

    }

    public static String kumpiVoittaa(String pelaaja1, String eka,
            String pelaaja2, String toka) {
        if (eka.equals(toka)) {
            System.out.println("Tasapeli!");
        } else if (eka.equals("kivi") & toka.equals("sakset")) {
            System.out.println(pelaaja1 + " voitti!");
        } else if (eka.equals("kivi") & toka.equals("paperi")) {
            System.out.println(pelaaja2 + " voitti!");
        } else if (eka.equals("sakset") & toka.equals("kivi")) {
            System.out.println(pelaaja2 + " voitti!");
        } else if (eka.equals("sakset") & toka.equals("paperi")) {
            System.out.println(pelaaja1 + " voitti!");
        } else if (eka.equals("paperi") & toka.equals("kivi")) {
            System.out.println(pelaaja1 + " voitti!");
        } else if (eka.equals("paperi") & toka.equals("sakset")) {
            System.out.println(pelaaja2 + " voitti!");

        }
        return "Kiitos pelistä " + pelaaja1 + " ja " + pelaaja2;
    }

}
