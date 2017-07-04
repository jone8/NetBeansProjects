
import java.util.ArrayList;

public class Varianssi {

    // Kopioi tänne tehtävän 70 metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int luku = 0;
        for (int luvut : lista) {
            luku = luku + luvut;
        }
    
        return (luku);
    }

    // Kopioi tänne tehtävän 71 metodi keskiarvo
    public static double keskiarvo(ArrayList<Integer> lista) {
        return (double) summa(lista) / lista.size();
    }

    public static double varianssi(ArrayList<Integer> lista) {
        double keskiarvo = keskiarvo(lista);
        double summattavat = 0;
        for (double eka : lista) {
            double summattava = Math.pow((eka - keskiarvo), 2);
            summattavat = summattavat + summattava;
        }
        return summattavat / (lista.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Varianssi: " + varianssi(lista));
    }

}
