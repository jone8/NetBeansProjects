
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nugetteja: ");
        int maara = Integer.parseInt(lukija.nextLine());
        if (maara == 4 || maara == 6 || maara == 9 || maara == 20) {
            System.out.println("Ostaminen on mahdollista");
        } else {
            System.out.println("Ostaminen ei ole mahdollista");
        }
    }

}
