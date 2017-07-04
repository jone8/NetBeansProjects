
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        System.out.println("Mihin asti?");
        int luku=Integer.parseInt(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int lukumista=Integer.parseInt(lukija.nextLine());
        int tuloste=lukumista;
        while(lukumista<=tuloste && tuloste<=luku){
            System.out.println(tuloste);
            tuloste++;
        }
        

        // KIRJOITA OHJELMASI TÄNNE
    }
}
