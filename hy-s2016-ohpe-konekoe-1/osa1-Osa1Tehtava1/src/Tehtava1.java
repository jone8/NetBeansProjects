
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna kolmas luku:");
        int kolmas = Integer.parseInt(lukija.nextLine());
        System.out.print("Anna neljäs luku:");
        int neljas = Integer.parseInt(lukija.nextLine());
        int summa = eka + toka + kolmas + neljas;
        System.out.println("Syötettyjen lukujen summa on " + summa);
    }

}
