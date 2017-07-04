
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        Scanner lukija = new Scanner(System.in);
        double kooste = 0;
        double maara = 0;
        System.out.println("Anna sademäärä, lopeta luvulla 999999");
        while (true) {
            System.out.println("Anna sademäärä: ");
            double luku = Double.parseDouble(lukija.nextLine());
            if (luku < 0) {
                continue;
            } else if (luku != 999999 && luku >= 0) {
                maara++;
                kooste += luku;
            } else {
                break;
            }
        }
        if (maara == 0) {
            System.out.println("Yhtään sademäärää ei annettu");
        } else {
            System.out.println("Sademäärien keskiarvo on " + kooste / maara);
        }

    }

}
