
import java.util.ArrayList;
import java.util.Scanner;

public class Vieraslista {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa -- nyt tai muutenkaan :)
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lueNimet(lukija, lista);
        tarkistaNimet(lukija, lista);

        // kun toteutat metodit, voit testata toimintaa täällä
        // lueNimet(lukija, lista);
        // System.out.println("");
        // tarkistaNimet(lukija, lista);
        // System.out.println("Kiitos!");
    }

    public static void lueNimet(Scanner lukija, ArrayList<String> lista) {
        while (true) {
            System.out.println("Syötä nimiä vieraslistalle, tyhjä rivi lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            lista.add(nimi);
        }
    }

    public static void tarkistaNimet(Scanner lukija, ArrayList<String> lista) {
        String lisaa="lisää";
        while (true) {
            System.out.println("Syötä nimiä, tyhjä rivi lopettaa");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            } 
            //else if(nimi.equals(lisaa)){
                //System.out.println("jee");
           // }
               
          
      
        else if (lista.contains(nimi)) 
                {
                System.out.println("Nimi on listalla.");
            } else {
                System.out.println("Nimi ei ole listalla.");
            }
        }
    }
}

