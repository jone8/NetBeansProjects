package asemat;

import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Mittaaja mittaaja = new Mittaaja(lukija);
        mittaaja.kaynnista();
    }

}
