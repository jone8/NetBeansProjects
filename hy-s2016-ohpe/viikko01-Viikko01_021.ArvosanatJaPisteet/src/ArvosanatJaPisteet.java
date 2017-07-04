
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int luku= Integer.parseInt (lukija.nextLine());
        if(luku<0) {
            System.out.println("Mahdotonta!");
        } else if (luku<75){
            System.out.println("hylätty");
        } else if (luku<90){
            System.out.println("hyväksytty");
        } else if (luku<101){
            System.out.println("5");
        } else{
            System.out.println("uskomatonta!");
        }
    }
}
