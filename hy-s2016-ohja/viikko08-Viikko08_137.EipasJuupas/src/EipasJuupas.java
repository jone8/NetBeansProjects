
import java.util.Scanner;

public class EipasJuupas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Merkkijono: ");
        String merkkijono2 = lukija.nextLine();
        if (merkkijono.equals(merkkijono2)) {
            System.out.println("Olipas!\nNo eipäs ollut!\nJuupas!");
        } else {
            System.out.println("Eipäs ollut!\nJuupas!\nEipäs!");
        }

// Toteuta tänne tehtävä "Eipäs Juupas"
    }
}
