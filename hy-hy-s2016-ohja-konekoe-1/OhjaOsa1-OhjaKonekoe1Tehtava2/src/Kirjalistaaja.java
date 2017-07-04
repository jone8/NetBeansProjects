
import java.util.ArrayList;
import java.util.Collections;
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
public class Kirjalistaaja {

    public Scanner scanner;
    private List<Kirja> kirjaLista;

    public Kirjalistaaja(Scanner scanner) {
        this.kirjaLista = new ArrayList<>();
    }

    public void listaaKirjat(Scanner scanner) {
        String nimiSyote = "";
        while (true) {

            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            nimiSyote = scanner.nextLine();
            if (nimiSyote.isEmpty()) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ikaSyote = Integer.parseInt(scanner.nextLine());
            Kirja kirja = new Kirja(nimiSyote, ikaSyote);
            this.kirjaLista.add(kirja);
        }
        System.out.println("Yhteensä: " + kirjaLista.size() + " kirjaa");
        kirjatJarjestykseen(kirjaLista);
        for (Kirja eka : kirjaLista) {
            System.out.println(eka.getNimi() + " (" + eka.getMinimiKohdeIka()
                    + " vuotiaille ja vanhemmille" + ")");
        }
    }

    public void kirjatJarjestykseen(List<Kirja> kirjaLista) {
        Collections.sort(kirjaLista);
    }

    public void samojaIkia() {
        List<Kirja> samaIkaLista = new ArrayList<>();
        for (Kirja eka : kirjaLista) {
            for (Kirja vertailtava : kirjaLista) {
                if (eka.getMinimiKohdeIka() == vertailtava.getMinimiKohdeIka()) {
                    samaIkaLista.add(eka);
                }
            }
        }

        Collections.sort(samaIkaLista);
    }
}
