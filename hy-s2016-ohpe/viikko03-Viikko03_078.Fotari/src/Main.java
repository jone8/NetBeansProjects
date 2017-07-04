
import java.util.ArrayList;
import java.util.Scanner;
import kuva.Fotari;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);

        // käytössä ilta.jpg, puu.jpg, kukka.jpg ja fluffy.jpg
        System.out.print("Mikä kuva avataan? ");
        String kuva = lukija.nextLine();

        Fotari.avaa(kuva);

        while (true) {
            System.out.print("komento (lopeta, vaalenna)? ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("vaalenna")) {
                vaalenna();
            }
        }

        Fotari.sulje();
    }

    public static void vaalenna() {
        int x = 0;
        while (x < Fotari.kuvanLeveys()) {
            int y = 0;
            while (y < Fotari.kuvanKorkeus()) {
                int punainen = Fotari.punainen(x, y);
                int vihrea = Fotari.vihrea(x, y);
                int sininen = Fotari.sininen(x, y);

                Fotari.asetaVari(x, y,
                        Math.min(255, punainen + 30),
                        Math.min(255, vihrea + 30),
                        Math.min(255, sininen + 30));

                y++;
            }
            x++;
        }
    }


}
