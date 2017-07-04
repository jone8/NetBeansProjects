
import java.util.Scanner;

public class SalasanaTahtina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Salasana tähtinä"
        System.out.println("Anna salasanasi: ");

        System.out.println("Salasanasi on siis " + tahtia());
    }

    public static String tahtia() {
        Scanner lukija = new Scanner(System.in);
        String sana = lukija.nextLine();
        int pituus = 0;
        String tahdet = "";
        while (sana.length() > pituus) {
            tahdet = tahdet + "*";
            pituus++;
        }

        return tahdet;
    }

}
