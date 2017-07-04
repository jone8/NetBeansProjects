
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> merkkijonot = new ArrayList<>();
        merkkijonot.add("never");
        merkkijonot.add("gonna");
        merkkijonot.add("give");
        merkkijonot.add("you");
        merkkijonot.add("up");

        System.out.println("Merkkijonojen keskipituus on " + keskipituudet(merkkijonot));
    }

    static double keskipituudet(ArrayList<String> lista) {
        int yhteispituus = 0;
        for (String eka : lista) {
            yhteispituus = yhteispituus + eka.length();
        }
        if (lista.size() == 0) {
            return -1;
        } else {
            return (double) yhteispituus / lista.size();
        }

    }
}
