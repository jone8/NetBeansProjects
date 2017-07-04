
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ekaKarkausVuosi = 0;
        int lisays = 4;
        int muutKarkausVuodet;
        int i = 0;
        System.out.println("Syötä vuosiluku: ");
        int vuosi = Integer.parseInt(lukija.nextLine());
        if (vuosi % 4 == 0) {
            ekaKarkausVuosi = vuosi;
        } else {
            ekaKarkausVuosi = vuosi + 4 - vuosi % 4;
        }
        int tokaKarkausvuosi = ekaKarkausVuosi + 4;

        int kolmasKarkausVuosi = tokaKarkausvuosi + 4;
        int neljasKarkausVuosi = kolmasKarkausVuosi + 4;
        int viidesKarkausVuosi = neljasKarkausVuosi + 4;
        System.out.println("Karkausvuodet: " + ekaKarkausVuosi + ", "
                + tokaKarkausvuosi + ", " + kolmasKarkausVuosi + ", "
                + neljasKarkausVuosi + ", " + viidesKarkausVuosi);

    }

}
