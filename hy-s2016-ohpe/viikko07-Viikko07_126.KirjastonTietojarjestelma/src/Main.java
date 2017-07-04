
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        Kirjasto kirjasto = new Kirjasto();

        Kirja cheese = new Kirja("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Kirja pollo = new Kirja("Pollojen elamaa", "Pollokustannus", 2010);
        // System.out.println(cheese.nimeke());
        kirjasto.lisaaKirja(cheese);
        kirjasto.lisaaKirja(pollo);
        // kirjasto.tulostaKirjat();

        System.out.println(kirjasto.haeKirjaNimekkeella("ch ee "));

        System.out.println(hylattyjenMaara());
    }
}
