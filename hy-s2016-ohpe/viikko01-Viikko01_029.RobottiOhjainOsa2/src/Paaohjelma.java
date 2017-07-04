
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();

        while(true){
            System.out.println("komento (sammuta, vasen, oikea, liiku, liikuMonta)");
        String teksti= lukija.nextLine();
            
            if (teksti.equals("sammuta")){
                break;
            }
            else if (teksti.equals("vasen")){
                Ohjain.vasen();
            }
            else if(teksti.equals("oikea")){
                Ohjain.oikea();
            }
            else if (teksti.equals("liiku")){
                Ohjain.liiku();
            }
            else if (teksti.equals("liikuMonta")){
                System.out.println("kuinka monta askelta");   
                int montako= Integer.parseInt(lukija.nextLine());
            
            }
           
        }
    }

// toteuta ohjelma tänne

        Ohjain.sammuta();
    }
}
}
