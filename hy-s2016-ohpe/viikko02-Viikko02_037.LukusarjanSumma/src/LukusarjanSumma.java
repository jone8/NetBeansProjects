
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti?");
        int apu=0;
        int muuttuva=0;
        int luku= Integer.parseInt(lukija.nextLine());
        while(apu<luku) {
            apu++;
            muuttuva=muuttuva+apu;    
        }
        System.out.println("Summa on "+ muuttuva);       
    }
}
