
import java.util.ArrayList;
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
     lueLuvut(lukija, lista);
        System.out.println();
        for(int luku:lista){
            System.out.println(luku);
        }
        // voit testata toimintaa täällä
        
        // alla on annettu eräs mahdollinen ratkaisu edellisen viikon tehtävään
        // Desibelimittaukset
//        lueLuvut(lukija, lista);
//        lista = valitseLuvutValilta(lista, 0, Integer.MAX_VALUE);
//
//        if (lista.isEmpty()) {
//            System.out.println("Ei lukuja.");
//        } else {
//            System.out.println("Lukujen keskiarvo: " + keskiarvo(lista));
//        }
    }
public static void lueLuvut (Scanner lukija, ArrayList <Integer> lista) {
    while(true){
        String luettu = lukija.nextLine();
int luettuLuku = Integer.parseInt(luettu);
        
       
       if(luettu.isEmpty()){
           break;
       }
        
       else{
           lista.add(luettuLuku);
       }
    }
    
}

}
