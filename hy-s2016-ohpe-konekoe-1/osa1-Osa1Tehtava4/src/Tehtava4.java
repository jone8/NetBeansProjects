
import java.util.Scanner;

public class Tehtava4 {

    public static void main(String[] args) {
        summa(26, 16);
// summa(2, 2); // Tulostaa 'Lukujen 2 ja 2 summa on 4'
        // summa(7, 4); // Tulostaa 'Lukujen 7 ja 4 summa on 11'
    }

    public static void summa(int eka, int toka) {
        int summaus = eka + toka;
        System.out.println("Lukujen " + eka + " ja " + toka + " summa on " + summaus);
    }
}
