
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Tulostaja tulostaja = new Tulostaja("src/testitiedosto.txt");

        tulostaja.tulostaRivitJoilla("Väinämöinen");
        System.out.println("-----");
        tulostaja.tulostaRivitJoilla("hjhlh");
        System.out.println("-----");
        tulostaja.tulostaRivitJoilla("");
        System.out.println("-----");
    }
}
