
import java.util.ArrayList;

import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {

    }

    public static boolean esiintyykoListallaKolmesti(ArrayList<Integer> luvut, int luku) {
        int apu = 0;
        for (int eka : luvut) {

            if (eka == luku) {
                apu++;
            }
        }
        if (apu != 3) {
            return false;
        } else {
            return true;
        }
    }

}
