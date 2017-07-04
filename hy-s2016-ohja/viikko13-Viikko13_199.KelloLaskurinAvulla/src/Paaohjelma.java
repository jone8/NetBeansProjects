
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne koodia jolla testaat että YlhaaltaRajoitettuLaskuri toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävissä tehtävän loppuosassa
        // (kohdat 3 ja 4) ja käyttää tehtäväannossa ehdotettua koodirunkoa
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        sekunnit.asetaArvo(50);
        minuutit.asetaArvo(59);
        tunnit.asetaArvo(23);
        int i = 0;
        while (i < 121) {
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);   // tulostetaan nykyinen aika
            sekunnit.seuraava();
            if (sekunnit.arvo() == 0) {
                minuutit.seuraava();
                if (minuutit.arvo() == 0) {
                    tunnit.seuraava();
                }
            }
// minuuttimäärä kasvaa
            // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa

            i++;
        }
    }
}
