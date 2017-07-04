
import java.util.Scanner;

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
            korkeus--;
            System.out.println("");

            if (korkeus > 0) {
                int apu = 0;
                for (int levea = leveys; levea > 0; levea--) {
                    if (apu % 2 == 0) {
                        System.out.print("x");
                    } else {
                        System.out.print("o");
                    }
                    apu++;
                }
            }

            System.out.println("");
        }
    }

}
