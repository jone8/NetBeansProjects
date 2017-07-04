
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kari
 */
import java.util.*;

public class Tilinhallintaohjelma {

    private HashMap<String, Integer> tilit = new HashMap<>();
    private Scanner scanner;

    public Tilinhallintaohjelma(Scanner scanner) {

        this.scanner = scanner;
    }

    public void tilienHallinta() {
        kysyTilit();
        while (true) {
            System.out.println("Komennot: \n"
                    + "siirto - tee tilisiirto\n"
                    + "tulosta - tulosta tilit\n"
                    + "lopeta - lopeta");
            String komento = scanner.nextLine();
            if (komento.equals("siirto")) {
                siirto();
            } else if (komento.equals("tulosta")) {
                System.out.println("Tulostetaan tilit");
                tulosta();
            } else if (komento.equals("lopeta")) {
                System.out.println("\nKiitos!");
                break;
            } else {
                System.out.println("Tuntematon komento: " + komento);
            }
        }
    }

    public void kysyTilit() {

        while (true) {
            System.out.println("Syötä tilinumero tai tyhjä jos valmis: ");
            String tilinumero = scanner.nextLine();
            if (tilinumero.isEmpty()) {
                break;
            }
            System.out.println("Syotä saldo: ");
            int saldo = Integer.parseInt(scanner.nextLine());
//            Tili tili = new Tili(tilinumero, saldo);
            tilit.put(tilinumero, saldo);
        }
    }

    public void siirto() {
        System.out.println("Miltä tililtä siirretään: ");
        String lahdeTili = scanner.nextLine();
        System.out.println("Mille tilille siirretään: ");
        String kohdeTili = scanner.nextLine();
        System.out.println("Paljonko: ");
        int maara = Integer.parseInt(scanner.nextLine());

        int lahdeTilinSaldo = tilit.get(lahdeTili) - maara;
        tilit.put(lahdeTili, lahdeTilinSaldo);
        int kohdeTilinSaldo = tilit.get(kohdeTili) + maara;
        tilit.put(kohdeTili, kohdeTilinSaldo);
    }

    public void tulosta() {
        for (String eka : tilit.keySet()) {
            System.out.println(eka + "(saldo: " + tilit.get(eka) + ")");
        }
    }

}
