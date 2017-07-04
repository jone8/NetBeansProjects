
import java.util.Scanner;
import robotti.Ohjain;

public class Portaikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        // KIRJOITA OHJELMASI TÄNNe
        int tulos=1;
        System.out.print("Montako ylös?");
        int luku= Integer.parseInt (lukija.nextLine());
        while(tulos<=luku) {
            Ohjain.vasen();
            Ohjain.liiku();
            Ohjain.oikea();
            Ohjain.liiku();
            tulos++;
        }
        
        int tulosalas=1;
        System.out.print("Montako alas?");
        int lukualas=Integer.parseInt (lukija.nextLine());     
        while(tulosalas<=lukualas){
            Ohjain.oikea();
            Ohjain.liiku();
            Ohjain.vasen();
            Ohjain.liiku();
            tulosalas++;
        }
        Ohjain.sammuta();
    }
}
