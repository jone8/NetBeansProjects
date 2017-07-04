
import java.util.*;
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
public class Muuntaja {
//private int luku;

    private Scanner scanner;

    public Muuntaja(Scanner scanner) {
        this.scanner = scanner;
    }

    public void muunna() {
        System.out.println("Metrejä: ");
        int luku = Integer.parseInt(scanner.nextLine());
        if (luku < 0) {
            System.out.println("Mitta oli negatiivinen, ei muunnoksia.");
            return;
        }
        System.out.println("Metrejä:" + luku);
        System.out.println("Muunnos virstoiksi: " + (double) luku / 1066.8);
        System.out.println("Muunnos peninkulmiksi: " + (double) luku / 10000);
        System.out.println("Muunnos poronkusemiksi: " + (double) luku / 7500);
    }
}
