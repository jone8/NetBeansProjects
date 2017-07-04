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

import java.util.Map;

public class Numerotiedustelu {

    private Map<String, Set<String>> puhelinmuistio;
    private Scanner lukija;

    public Numerotiedustelu() {
        this.puhelinmuistio = new HashMap<>();
        this.lukija = new Scanner(System.in);
    }

    public void kaynnista() {
        System.out.println(" numerotiedustelu\n"
                + " käytettävissä olevat komennot:\n"
                + " 1 lisää numero\n"
                + " 2 hae numerot\n"
                + " 3 hae puhelinnumeroa vastaava henkilö\n"
                + " 4 lisää osoite\n"
                + " 5 hae henkilön tiedot\n"
                + " 6 poista henkilön tiedot\n"
                + " 7 filtteröity listaus\n"
                + " x lopeta");
        while (true) {
            System.out.print("Komento: ");
            String syote = lukija.nextLine();
            if (syote.equals("1")) {
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                lisaa(nimi, numero);
            } else if (syote.equals("2")) {
                System.out.print("kenen: ");
                String nimi = lukija.nextLine();
                haeNumerot(nimi);
            } else if (syote.equals("3")) {
                hakuNumerolla();
            } else if (syote.equals("x")) {
                return;
            }

        }
    }

    private void lisaa(String henkilo, String numero) {
        if (!this.puhelinmuistio.containsKey(henkilo)) {
            this.puhelinmuistio.put(henkilo, new HashSet<>());
        }
        this.puhelinmuistio.get(henkilo).add(numero);

    }

    private void haeNumerot(String nimi) {

        if (!this.puhelinmuistio.containsKey(nimi)) {
            System.out.println("Ei löytynyt");
        } else {
            System.out.println(this.puhelinmuistio.get(nimi));
        }
    }

    public void hakuNumerolla() {
        System.out.println("numero: ");
        String numero = lukija.nextLine();
//    if(!this.puhelinmuistio.containsValue(numero)){
//        System.out.println("Ei löytynyt");
//    }
//    else{
        for (String eka : this.puhelinmuistio.keySet()) {
//            if (this.puhelinmuistio.get(eka).equals("numero")) {
                System.out.println(eka);
//            }

//       }
        }
    }
}
