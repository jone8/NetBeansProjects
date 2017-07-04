
import java.util.ArrayList;

public class Varianssi {

    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for (int eka : lista) {
            summa += eka;
        }
        return summa;
    }

    public static double keskiarvo(ArrayList<Integer> lista) {
        return (double) summa(lista) / lista.size();
    }

    public static double varianssi(ArrayList<Integer> lista) {
        double varianssiSumma = 0;
        double keskiarvo = keskiarvo(lista);
        for (int eka : lista) {
            varianssiSumma += (Math.pow(eka - keskiarvo, 2));
        }
        System.out.println("varsumma" + varianssiSumma);
        return varianssiSumma / (lista.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println((double) 1 / summa(lista));
        System.out.println("summa" + summa(lista));
        System.out.println("Varianssi: " + varianssi(lista));
    }

}
