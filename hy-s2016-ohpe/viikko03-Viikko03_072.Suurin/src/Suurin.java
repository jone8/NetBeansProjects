
import java.util.ArrayList;
import java.util.Collections;

public class Suurin {

    public static int suurin(ArrayList<Integer> lista) {
        Integer suurin = Collections.max(lista);
        // kirjoita koodia tähän
        return suurin;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Suurin: " + suurin(lista));
    }
}
