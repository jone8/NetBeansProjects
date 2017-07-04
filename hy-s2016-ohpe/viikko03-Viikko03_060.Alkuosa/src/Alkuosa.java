
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna sana: ");
        String nimi = lukija.nextLine();
        System.out.println("Alkuosan pituus: ");
        int pituus = Integer.parseInt(lukija.nextLine());
        System.out.println("Tulos: " + nimi.substring(0, pituus));
    }
}
