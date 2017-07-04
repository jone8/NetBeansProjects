
import java.awt.geom.Path2D;
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
        ArrayList<Integer> lukuja = new ArrayList<>();
        lukuja.add(1);
        lukuja.add(8);
        lukuja.add(8);
        lukuja.add(1);
        lukuja.add(2);

        System.out.println(loytyykoLuvutValilta(lukuja, 8, 8));

    }

    public static boolean loytyykoLuvutValilta(ArrayList<Integer> luvut, int alku, int loppu) {
        int osumat = 0;
        for (int luku = alku; luku <= loppu; luku++) {
            luvut.contains(luku);
            if (luvut.contains(luku)) {
                osumat++;

            }
        }
        if (osumat == loppu - alku + 1) {
            return true;
        } else {
            return false;
        }
    }

}
