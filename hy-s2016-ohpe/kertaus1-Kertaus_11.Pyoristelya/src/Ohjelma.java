
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku % 5 == 0) {
            luku = luku;
        } else {
            luku = luku + (5 - luku % 5);

        }
        System.out.println("Pyöristys: " + luku);
    }
}
