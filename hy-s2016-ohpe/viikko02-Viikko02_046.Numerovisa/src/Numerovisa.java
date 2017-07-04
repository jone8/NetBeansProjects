
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();

        // OHJELMOI OHJELMASI TÄHÄN, ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA
        int arvaus = 1;
        while (true) {
            System.out.println("Arvaa luku");
            int luku = Integer.parseInt(lukija.nextLine());
            if (arvottuLuku < luku) {
                System.out.println("Luku on pienempi, tehtyja arvauksia " + arvaus);
                arvaus++;
            } else if (arvottuLuku > luku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia " + arvaus);
                arvaus++;
            } else {
                break;
            }

        }
        System.out.println("Onneksi olkoon, oikein arvattu!");
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
