 
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("AnnaLuku ");
        int maara = Integer.parseInt(lukija.nextLine());

        ylaJaAla(maara);
        System.out.println("");
        for (int kauanko = maara - 2; kauanko > 0; kauanko--) {
            keski(maara);
            System.out.println("");
        }
        if (maara > 1) {
            ylaJaAla(maara);
        }

        System.out.println("");
    }

    public static void ylaJaAla(int montako) {
        while (montako > 0) {
            System.out.print("*");
            montako--;
        }

    }

    public static void keski(int maara) {
        System.out.print("*");
        for (int kauanko = maara - 2; kauanko > 0; kauanko--) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}
