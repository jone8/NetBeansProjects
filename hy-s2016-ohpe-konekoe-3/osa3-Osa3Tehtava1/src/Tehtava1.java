
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Syötä lukuja, nolla tai negatiivinen lopettaa"
                + " lukemisen.");
        int eka = 0;
        int keskiarvo = 0;
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku <= 0) {
                break;
            } else {
                lista.add(luku);

            }
        }

        if (lista.size() < 3) {
            System.out.println("Ei tarpeeksi lukuja.");
        } else {
            System.out.println("Keskiarvo: "
                    + (double) (lista.get(lista.size() - 1)
                    + lista.get(lista.size() - 2)
                    + lista.get(lista.size() - 3)) / 3);
        }
    }

}
