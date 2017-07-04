
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Hip Hip Hurraa"
        System.out.print("Kirjoita merkkijono: ");
        hipHipHurraa();

    }

    public static void hipHipHurraa() {
        Scanner lukija = new Scanner(System.in);
        String sana = lukija.nextLine();
        int i = 0;
        for (i = 0; i < sana.length(); i++) {

            System.out.print(sana.charAt(i));
            if ((i + 1) % 2 == 0) {
                System.out.print(" hip");
            }
            if ((i + 1) % 5 == 0) {
                System.out.print(" hurraa");
            }
            System.out.println("");
        }
    }
}
