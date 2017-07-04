
import java.util.Scanner;

public class NimenKaantaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        int apu = nimi.length() - 1;
        System.out.print("Väärinpäin ");
        while (apu >= 0) {
            System.out.print(nimi.charAt(apu));
            apu--;
        }

        System.out.println("");
    }
}
