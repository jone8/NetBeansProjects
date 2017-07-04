
import java.util.ArrayList;
import java.util.Scanner;

public class ToistuvaSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
        String sana;
        while (true) {
            System.out.print("Anna sana ");
            sana = lukija.nextLine();
            if (sanat.contains(sana)) {
                break;

            }
            sanat.add(sana);
        }
        // tee tänne edellisen tehtävän tapaan ArrayList johon laitat sanat
        System.out.println("Annoit uudestaan sanan " + sana);
    }
}
