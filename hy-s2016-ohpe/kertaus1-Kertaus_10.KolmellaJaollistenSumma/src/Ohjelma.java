
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        while (true) {
            System.out.println("Luku:");
            String luku = lukija.nextLine();
            if (luku.isEmpty()) {
                break;
            }
            int intluku = Integer.parseInt(luku);
            if (intluku % 3 == 0) {
                summa = summa + intluku;
            }
        }
        System.out.println("Kolmella jaollisten lukujen summa: " + summa);
    }

}
