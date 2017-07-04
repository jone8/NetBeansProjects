
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int luku = Integer.parseInt(lukija.nextLine());
        int apu = 0;
        while (apu <= luku) {
            System.out.println(apu);
            apu += 4;
        }
    }
}
