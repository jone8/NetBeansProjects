
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kirjalistaaja listaaja = new Kirjalistaaja(lukija);
        listaaja.listaaKirjat(lukija);

    }

}
