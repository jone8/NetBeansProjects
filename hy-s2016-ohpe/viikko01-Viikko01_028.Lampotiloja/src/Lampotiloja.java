
import java.util.Scanner;

public class Lampotiloja {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        // Toteuta lämpötilaohjelma tähän.
        while(true){ 
            System.out.print("Kerro liukuluku.");
            double luku=Double.parseDouble(lukija.nextLine());
            if (luku>1000){
                kuvaaja.lisaaNumero(luku);
           }
            if (luku<=-1000)
            
            {
                break;
                
                   }
       
        }
    }
}
        
  
        // Näin kuvaajaa käytetään:
//        Kuvaaja.lisaaNumero(7);
//        double luku = 13.5;
//        Kuvaaja.lisaaNumero(luku);
//        luku = 3;
//        Kuvaaja.lisaaNumero(luku);
        // poista tai kommentoi nämä esimerkkikomennot ennenkuin teet ohjelmasi!
        // saat kommentoitua rivit helposti maalaamalla ne hiirellä ja painamalla yhtä aikaa ctrl, shift ja c

