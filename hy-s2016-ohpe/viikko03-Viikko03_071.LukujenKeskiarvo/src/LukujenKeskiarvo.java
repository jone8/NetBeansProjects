
import java.util.ArrayList;

public class LukujenKeskiarvo {

    // Kopioi tänne edellisen tehtävän metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int apu = 0;
        int luku = 0;
        while (apu < lista.size()) {
            int uusi = lista.get(apu);
            luku = luku + uusi;
            apu++;
        }
        return (luku);
    }

    public static double keskiarvo(ArrayList<Integer> lista) {
        return (double) summa(lista) / lista.size();
// kirjoita koodia tähän
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Keskiarvo: " + keskiarvo(lista));
    }
}
