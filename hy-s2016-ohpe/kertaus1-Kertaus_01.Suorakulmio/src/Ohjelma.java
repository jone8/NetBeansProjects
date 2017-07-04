
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Leveys?");
        int leveys = Integer.parseInt(lukija.nextLine());
        System.out.println("Korkeus?");
        int korkeus = Integer.parseInt(lukija.nextLine());

        for (korkeus = korkeus; korkeus > 0; korkeus--) {
            for (int levea = leveys; levea > 0; levea--) {
                System.out.print("x");
            }
            System.out.println("");
        }

    }

}
