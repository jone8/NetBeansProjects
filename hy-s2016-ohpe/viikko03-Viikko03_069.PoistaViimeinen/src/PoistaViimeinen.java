
import java.util.ArrayList;
import java.util.Collections;

public class PoistaViimeinen {

    public static void poistaViimeinen(ArrayList<String> lista) {

        lista.remove(lista.size() - 1);
        // Kirjoita koodia tänne
    }

    public static void main(String[] args) {
        // Tässä esimerkki siitä mitä poistaViimeinen-metodilla voi tehdä.
        ArrayList<String> tyypit = new ArrayList<>();
        tyypit.add("Pekka");
        tyypit.add("Mauri");
        tyypit.add("Jore");
        tyypit.add("Simppa");

        System.out.println("Tyypit:");
        System.out.println(tyypit);

        // Tyypit järjestykseen!
        Collections.sort(tyypit);

        // Heitetään viimeinen mäkeen!
        poistaViimeinen(tyypit);

        System.out.println(tyypit);
    }
}
