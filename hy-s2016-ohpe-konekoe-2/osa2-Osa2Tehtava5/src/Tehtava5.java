
import java.util.Scanner;

public class Tehtava5 {

    public static void main(String[] args) {
        Henkilo pekka = new Henkilo("Pekka M.", "040-123123");
        System.out.println(pekka);
        pekka.vaihdaNumeroa("050-333444");
        System.out.println(pekka);

// Tulostuu:
        // Pekka M., puh: 040-123123
        // Pekka M., puh: 050-333444
    }

}
