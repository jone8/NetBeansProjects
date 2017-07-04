
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Muuntaja muuntaja = new Muuntaja(lukija);
        muuntaja.muunna();
    }

}
