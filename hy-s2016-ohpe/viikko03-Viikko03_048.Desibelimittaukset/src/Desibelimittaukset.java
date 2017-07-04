
import java.util.Locale;
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       double kooste=0;
       double maara=0;
       while(true){
        double luku= Double.parseDouble(lukija.nextLine());
         if (luku<0)  {
             System.out.println("Anna desibelilukuja, lopeta luvulla 9999");
         }
         else if(luku!=9999&& luku>=0){
            System.out.println("Anna desibelilukuja, lopeta luvulla 9999");
            maara++;
           kooste+=luku;
          }
            
            else {
                break;
            }
       }  
        if (maara==0) {
            System.out.println("Yhtään desibelilukua ei annettu");
        }       
        else {
        System.out.println("Desibelilukujen keskiarvo on " + kooste/maara);
        }
        
        
// Toteuta tänne ohjelma, joka laskee desibelimittausten keskiarvoja
        // Huomaa että ohjelmassa ei ole paikallisia testejä, vaan ohjelman
        // toiminta tarkastetaan palvelimella
        
    }
}
