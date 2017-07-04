
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen:");
        int muuttuva=0;
        int apu= Integer.parseInt(lukija.nextLine());
        System.out.print("Viimeinen:");
        int luku= Integer.parseInt(lukija.nextLine());
        muuttuva=apu;
        while(apu<luku) {
            apu++;
            muuttuva=muuttuva+apu;    
        }
        System.out.println("Summa on "+ muuttuva); 
  
    }
}
