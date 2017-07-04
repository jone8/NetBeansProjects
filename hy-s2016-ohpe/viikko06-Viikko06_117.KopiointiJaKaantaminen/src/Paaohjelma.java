
import java.util.*;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testauskoodia tänne
        int[] alkuperainen = {1, 2, 3, 4};
        int[] kaannetty = kaanna(alkuperainen);

        // tulostetaan molemmat
        System.out.println("alkup: " + Arrays.toString(alkuperainen));
        System.out.println("käännetty: " + Arrays.toString(kaannetty));
    }

    public static int[] kopioi(int[] taulukko) {
        int alkioita = taulukko.length;
        int[] kopio = new int[alkioita];
        for (int i = 0; i < taulukko.length; i++) {
            kopio[i] = taulukko[i];
        }
        return kopio;
    }

    public static int[] kaanna(int[] taulukko) {
        int alkioita = taulukko.length;
        int[] kopio = new int[alkioita];
        int a = taulukko.length - 1;
        for (int i = 0; i < taulukko.length; i++) {
            kopio[a] = taulukko[i];
            a--;
        }
        return kopio;
    }

}
