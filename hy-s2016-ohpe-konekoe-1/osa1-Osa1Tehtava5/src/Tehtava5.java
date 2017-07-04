
import java.util.Scanner;

public class Tehtava5 {

    public static void main(String[] args) {
        suorakulmio(2, 4);
// Kokeile metodisi toimintaa seuraavilla kutsuilla
        // suorakulmio(4, 3);
        // suorakulmio(7, 4);
    }

    public static void suorakulmio(int eka, int toka) {
        int apu = 0;

        while (apu < toka) {
            int koe = 0;
            while (koe < eka) {
                System.out.print("O");
                koe++;
            }
            System.out.println("");
            apu++;
        }
    }

}
