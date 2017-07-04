
import java.util.*;

public class Ohjelma {

    public static void main(String[] args) {
       
    
    }

    public static boolean esiintyykoListallaKerran(ArrayList<Integer> luvut, int luku) {
        int apu = 0;
        for (int eka : luvut) {

            if (eka == luku) {
                apu++;
            }
        }
        if (apu != 1) {
            return false;
        } else {
            return true;
        }
    }
}
