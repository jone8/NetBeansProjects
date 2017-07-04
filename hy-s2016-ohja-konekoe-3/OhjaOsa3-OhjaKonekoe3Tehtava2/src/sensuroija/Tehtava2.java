package sensuroija;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        ArrayList<String> rivit = new ArrayList<>();

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luettavan tiedoston nimi: ");
        String luettavanTiedostonNimi = lukija.nextLine();
        System.out.print("Anna sensuroitava sana: ");
        String sensuroitavaSana = lukija.nextLine();
        System.out.println("Anna tiedosto, johon sensuroitu teksti kirjoitetaan:");
        String kohdeTiedostonNimi = lukija.nextLine();

        lueTiedosto(luettavanTiedostonNimi, rivit);

        ArrayList<String> uudetRivit = new ArrayList<>();
        for (String rivi : rivit) {

            uudetRivit.add(rivi.replaceAll(sensuroitavaSana,
                    tahtienTulostus(sensuroitavaSana)));
        }

        tallenna(kohdeTiedostonNimi, uudetRivit);
    }

    static void lueTiedosto(String tiedostonNimi, ArrayList<String> rivit) {

        try (Scanner lukija = new Scanner(new File(tiedostonNimi))) {

            while (lukija.hasNextLine()) {
                rivit.add(lukija.nextLine());
            }
            lukija.close();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }

    static void tallenna(String tiedostonNimi, ArrayList<String> teksti) {

        try {
            FileWriter kirjoittaja = new FileWriter(tiedostonNimi);

            for (String rivi : teksti) {

                kirjoittaja.write(rivi + "\n");
            }
            kirjoittaja.close();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }

    static String tahtienTulostus(String sana) {
        String tahdet = "";
        for (int i = 0; i < sana.length(); i++) {
            tahdet += "*";
        }
        return tahdet;
    }

}
