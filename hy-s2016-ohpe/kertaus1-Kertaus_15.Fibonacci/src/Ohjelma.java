
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Montako lukua tulostetaan: ");
        int montako = Integer.parseInt(lukija.nextLine());

        int sitaEdellinen = 0;
        int edellinen = 1;
        if (montako >= 1) {
            System.out.print(1);
            montako--;
        }
        for (montako = montako; montako > 0; montako--) {
            int fibonacci = sitaEdellinen + edellinen;
            System.out.print(", " + fibonacci);
            sitaEdellinen = edellinen;
            edellinen = fibonacci;
        }
        System.out.println("");
    }
}
