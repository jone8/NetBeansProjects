
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        for (int apu = 1; apu <= 10; apu++) {
            System.out.println(apu + " * " + luku + " = " + apu * luku);
        }

    }
}
