
import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tilinhallintaohjelma ohj = new Tilinhallintaohjelma(lukija);
        ohj.tilienHallinta();

    }

}
