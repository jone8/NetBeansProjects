
import java.util.Scanner;

public class IanTarkastus {

    public static void main(String[] args) {
       
        
        
        
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka vanha olet?");
        int luku= Integer.parseInt(lukija.nextLine());
        if(luku>-1 && luku <121){
            System.out.println("OK");
        }else{
            System.out.println("Mahdotonta!");
        }
    }
}
