
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
//
//        YlhaaltaRajoitettuLaskuri kelloLaskuri = new YlhaaltaRajoitettuLaskuri(14);
//        
//        int i=0;
//        while(i<16){
//            kelloLaskuri.seuraava();
//            System.out.println(kelloLaskuri);
//       i++;
//        }
//public class Paaohjelma {

        //public static void main(String[] args) {
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        System.out.print("sekunnit: ");
        int sek = Integer.parseInt(lukija.nextLine());
        System.out.print("minuutit: ");
        int min = Integer.parseInt(lukija.nextLine());
        System.out.print("tunnit: ");
        int tun = Integer.parseInt(lukija.nextLine());

        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);

        int i = 0;
        while (i < 121) {
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);   // tulostetaan nykyinen aika
            sekunnit.seuraava();
//            
//           while(i<121){
//            int x=0;
//          int b=0;
//            while(x<120){
//              
//              while(x<59){
//                  x++;
//              
//             System.out.println(b+x);  
//          }
//            b++;
//            }
//           }
//           

            if (sekunnit.arvo() == 0) {
                minuutit.seuraava();
            }
            if (minuutit.arvo() == 0 && tunnit.arvo() == 0) {
                tunnit.asetaArvo(23);
            }

            if (minuutit.arvo() == 0) {
                tunnit.seuraava();
            }

// minuuttimäärä kasvaa
            // jos minuuttimäärä menee nollaan, tuntimäärä kasvaa
            i++;
        }

    }
}

// tee tänne koodia jolla testaat että YlhaaltaRajoitettuLaskuri toimii halutulla tavalla
// muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävissä 89.3 ja 89.4 ja käyttää tehtäväannossa
// ehdotettua koodirunkoa
//}
//}
