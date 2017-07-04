
import java.util.*;

public class Tehtava4Ja5 {

    public static void main(String[] args) {
        // toteuta tänne tehtävät 4 ja 5
//     Kurssisuoritus tira = new Kurssisuoritus("Tira", 2, 5);
//    System.out.println(tira);
//    tira.setArvosana(5);
//    System.out.println(tira);
//    System.out.println("kurssi: " + tira.getKurssi());
//   System.out.println("opintopisteet: " + tira.getOpintopisteet());
//    System.out.println("arvosana: " + tira.getArvosana());

        Opiskelija pekka = new Opiskelija("Pekka");
        pekka.suorita("Tietorakenteet", 2, 8);
        pekka.suorita("Johdatus yliopistomatematiikkaan", 5, 4);
        pekka.suorita("Vuorovaikutukset ja kappaleet", 1, 5);
        // System.out.println(pekka.opintopisteita());
        pekka.suoritusote();
        // pekka.suorita("Tietorakenteet", 1, 8);
//    pekka.suorita("Vuorovaikutukset ja kappaleet", 5, 5);
//    System.out.println("\nuusintakokeiden jälkeen:\n");
//    pekka.suoritusote();

    }

}
