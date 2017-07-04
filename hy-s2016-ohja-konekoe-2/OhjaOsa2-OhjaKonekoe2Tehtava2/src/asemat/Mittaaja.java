/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asemat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kari
 */
public class Mittaaja {

    private Map<String, ArrayList> mittaukset;
    private Scanner scanner;

    public Mittaaja(Scanner scanner) {
        this.mittaukset = new HashMap<>();
        this.scanner = scanner;
    }

    public void kaynnista() {

        mittaa();
        System.out.println("\nKiitos!\n\nMittaustulokset:");
        mittaustulokset();
    }

    public void mittaa() {

        while (true) {
            String paikka = "";
            int lampo = 0;
            System.out.print("Syötä  mittauspisteen nimi, tyhjä lopettaa: ");
            paikka = scanner.nextLine();
            if (paikka.equals("")) {
                break;
            }
            System.out.print("Syötä mittaus: ");
            lampo = Integer.parseInt(scanner.nextLine());
            if (!mittaukset.containsKey(paikka)) {
                mittaukset.put(paikka, new ArrayList<>());
                mittaukset.get(paikka).add(lampo);
            } else {
                mittaukset.get(paikka).add(lampo);
            }
        }
    }

    public void mittaustulokset() {
        for (String tamaPaikka : this.mittaukset.keySet()) {
            System.out.println("Piste " + tamaPaikka + ", " + "keskimittaus "
                    + paikanKeskiMittaus(this.mittaukset.get(tamaPaikka)) + ", "
                    + "mittauksia: "
                    + mittauksienMaara(this.mittaukset.get(tamaPaikka)));
        }
    }

    public double paikanKeskiMittaus(ArrayList<Integer> lista) {
        int summa = 0;
        for (int tamaLampo : lista) {
            summa = summa + tamaLampo;
        }
        return (double) summa / lista.size();
    }

    public int mittauksienMaara(ArrayList<Double> lista) {
        return lista.size();
    }

}
