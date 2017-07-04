
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        for (int kertoja = 1; kertoja <= 10; kertoja++) {
            System.out.println(kertoja + " * " + luku + " = " + kertoja * luku);
        }
    }

}
