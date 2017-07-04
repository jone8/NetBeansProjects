package varastonhallinta;

import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Varastonhallitsija hallitsija=new Varastonhallitsija(lukija);
        hallitsija.aloita();
    }

}
